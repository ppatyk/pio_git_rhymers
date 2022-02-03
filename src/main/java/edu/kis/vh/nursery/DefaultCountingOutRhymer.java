package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

	public static final int check = -1;
	public static final int full = 11;
	private int[] numbers = new int[12];

	public int total = -1;


	public void countIn(int in) {
		if (!isFull())
			numbers[++total] = in;
	}

	public boolean callCheck() {
		return total == check;
	}

	public boolean isFull() {
		return total == full;
	}

	protected int getValue() {
		if (callCheck())
			return -1;
		return numbers[total];
	}

	public int countOut() {
		if (callCheck())
			return -1;
		return numbers[total--];
	}

}
