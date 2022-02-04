package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

	private static final int TABLE_SIZE = 12;
	private static final int EMPTY_ID = -1;

	private final int[] numbers = new int[TABLE_SIZE];

	private int total = EMPTY_ID;

	public void countIn(int in) {
		if (!isFull())
			numbers[++total] = in;
	}

	public boolean callCheck() {
		return total == EMPTY_ID;
	}

	public int getTotal() {
		return total;
	}

	public boolean isFull() {
		return total == TABLE_SIZE - 1;
	}

	protected int getValue() {
		if (callCheck())
			return EMPTY_ID;
		return numbers[total];
	}

	public int countOut() {
		if (callCheck())
			return EMPTY_ID;
		return numbers[total--];
	}

}
