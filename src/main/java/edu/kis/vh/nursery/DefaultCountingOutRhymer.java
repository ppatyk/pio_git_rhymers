package edu.kis.vh.nursery;

/**
 * Default counting out Rhymer class for integer numbers.
 * 
 * @author PPatyk
 *
 */
public class DefaultCountingOutRhymer {

	private static final int TABLE_SIZE = 12;
	private static final int EMPTY_ID = -1;

	private final int[] numbers = new int[TABLE_SIZE];

	private int total = EMPTY_ID;

	/**
	 * Puts new number to the Rhymer.
	 * @param in - number to add to the Rhymer.
	 */
	public void countIn(int in) {
		if (!isFull())
			numbers[++total] = in;
	}

	/**
	 * Checks if Rhymer is empty.
	 * @return boolean true if Rhymer is empty.
	 */
	public boolean callCheck() {
		return total == EMPTY_ID;
	}

	/**
	 * Gets total numbers in Rhymer.
	 * @return total numbers in Rhymer.
	 */
	public int getTotal() {
		return total;
	}

	/**
	 * Checks if Rhymer is full.
	 * @return boolean true if Rhymer is full.
	 */
	public boolean isFull() {
		return total == TABLE_SIZE - 1;
	}

	/**
	 * Gets last number.
	 * @return last number value.
	 */
	protected int getValue() {
		if (callCheck())
			return EMPTY_ID;
		return numbers[total];
	}

	/**
	 * Gets last number from Rhymer and remove it.
	 * @return value of last number in Rhymer.
	 */
	public int countOut() {
		if (callCheck())
			return EMPTY_ID;
		return numbers[total--];
	}

}
