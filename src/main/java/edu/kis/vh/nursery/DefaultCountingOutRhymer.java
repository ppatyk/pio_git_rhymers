package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

	public static final int TABLE_SIZE = 12;
	public static final int EMPTY_ID = -1;
	public static final int FULL = TABLE_SIZE-1;

	private final int[] numbers = new int[TABLE_SIZE];

	public int total = -1;


	public void countIn(int in) {
		if (!isFull())
			numbers[++total] = in;
	}

	public boolean callCheck() {
		return total == EMPTY_ID;
	}

	public boolean isFull() {
		return total == FULL;
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
