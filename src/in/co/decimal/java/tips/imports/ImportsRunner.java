package in.co.decimal.java.tips.imports;

import static java.lang.System.out;
import static java.util.Collections.sort;

import java.util.ArrayList;
import java.util.List;

public class ImportsRunner {

	public static void main(String[] args) {


		// static imports: before
		System.out.println("Imports");
		// static imports: before
		out.println("Hello Static imports");

		// for List:
		List<Integer> numbers = List.of(2, 13, 234, 12, 1);
		List<Integer> number = new ArrayList<Integer>(numbers);
		sort(number);
		System.out.println(number);

		List<Integer> list = List.of(2, 13, 234, 12, 1);

	}
}
