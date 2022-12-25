package in.co.decimal.java.tips.enums;

public enum Season1 {
	SPRING(4), WINTER(1), SUMMER(2), FALL(3);

	private int value;

	// constructor:
	private Season1(int value) {
		this.value = value;
	}

	/**
	 * @return the value
	 */
	public int getValue() {
		return value;
	}

}