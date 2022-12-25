package in.co.decimal.java.tips.anonymous;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

//class LengthComparator implements Comparator<String> {
//
//	@Override
//	public int compare(String str1, String str2) {
//
//		return Integer.compare(str1.length(), str2.length());
//	}
//
//}

public class AnonymousClassRunner {
	public static void main(String[] args) {
		List<String> animalsList = new ArrayList<String>(List.of("Ant", "Cat", "Ball", "Elephant"));

		Comparator<String> lengthComaprator = new Comparator<String>() {

			@Override
			public int compare(String str1, String str2) {
				return Integer.compare(str1.length(), str2.length());
			}

		};
		Collections.sort(animalsList, lengthComaprator);
		System.out.println(animalsList);
	}
}
