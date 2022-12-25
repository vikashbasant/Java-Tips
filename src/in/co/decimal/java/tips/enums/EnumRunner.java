package in.co.decimal.java.tips.enums;

import java.util.Arrays;

enum Season {
	WINTER, SUMMER, FALL, SPRING;
	// 0 , 1 , 2 , 3 <- ordinal
}
public class EnumRunner {

	Season season;

	public static void main(String[] args) {
		Season season = Season.FALL;

		Season season1 = Season.valueOf("WINTER");
		System.out.println(season1);

		System.out.println(season1.name());

		System.out.println(season1.ordinal());

		System.out.println(Season.SPRING.ordinal());

		System.out.println(Arrays.toString(Season.values()));
	}
}
