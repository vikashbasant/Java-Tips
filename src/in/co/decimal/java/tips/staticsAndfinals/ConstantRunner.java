package in.co.decimal.java.tips.staticsAndfinals;

public class ConstantRunner {

	public static final int SECONDS_IN_MINUTES = 60;
	public static final int MINUTES_IN_HOURS = 60;
	public static final int TOTAL_HOURS_IN_A_DAY = 24;
	public static final int SECONDS_IN_DAY = SECONDS_IN_MINUTES * MINUTES_IN_HOURS * TOTAL_HOURS_IN_A_DAY;

	public static void main(String[] args) {

		System.out.println("Integer MIN_VALUE: " + 0x80000000);
		System.out.println("Integer MIN_VALUE: " + Integer.MIN_VALUE);

		System.out.println("Integer MAX_VALUE: " + 0x7fffffff);
		System.out.println("Integer MAX_VALUE: " + Integer.MAX_VALUE);

		System.out.println("Total seconds in days: " + SECONDS_IN_DAY);
	}
}
