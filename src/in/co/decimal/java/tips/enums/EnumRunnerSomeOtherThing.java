package in.co.decimal.java.tips.enums;

import java.util.Arrays;


public class EnumRunnerSomeOtherThing {

	Season1 season;

	public static void main(String[] args) {
		Season1 season = Season1.FALL;

		Season1 season1 = Season1.valueOf("WINTER");
		System.out.println(season1);

		System.out.println(season1.name());

		System.out.println(Season1.SPRING.getValue());

		System.out.println(Season1.SPRING.ordinal()); // ordinal starts with 0,1,2,3,4....

		System.out.println(Arrays.toString(Season1.values()));
	}
}
