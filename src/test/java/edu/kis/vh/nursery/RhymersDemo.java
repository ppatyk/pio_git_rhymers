package edu.kis.vh.nursery;

import edu.kis.vh.nursery.DefaultCountingOutRhymer;
import edu.kis.vh.nursery.HanoiRhymer;
import edu.kis.vh.nursery.factory.DefaultRhymersFactory;
import edu.kis.vh.nursery.factory.RhymersFactory;

class RhymersDemo {

	private static final int MAX_COUNT = 15;
	private static final int RHYMERS_COUNT = 3;
	private static final int MAX_NUMBER = 20;

	public static void main(String[] args) {
		RhymersFactory factory = new DefaultRhymersFactory();
		testRhymers(factory);
	}

	private static void testRhymers(RhymersFactory factory) {
		DefaultCountingOutRhymer[] rhymers = { factory.getStandardRhymer(), factory.getFalseRhymer(),
				factory.getFIFORhymer(), factory.getHanoiRhymer() };

		for (int i = 1; i < MAX_COUNT; i++)
			for (int j = 0; j < RHYMERS_COUNT; j++)
				rhymers[j].countIn(i);

		java.util.Random rn = new java.util.Random();
		for (int i = 1; i < MAX_COUNT; i++)
			rhymers[RHYMERS_COUNT].countIn(rn.nextInt(MAX_NUMBER));

		for (int i = 0; i < rhymers.length; i++) {
			while (!rhymers[i].callCheck())
				System.out.print(rhymers[i].countOut() + "  ");
			System.out.println();
		}

		System.out.println("total rejected is " + ((HanoiRhymer) rhymers[RHYMERS_COUNT]).reportRejected());
	}

}