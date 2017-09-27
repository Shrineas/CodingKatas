package anagrams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Anagrams {
	public static List<String> of(String s) {
//		if (s.equals("")) {
//			return new ArrayList<>();
//		}
		return new ArrayList<>(Arrays.asList(s));
	}
}
