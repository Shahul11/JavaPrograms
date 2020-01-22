package JavaPrograms;

import java.util.HashMap;
import java.util.Map;

public class DuplicateCharactersCount {

	public static void main(String[] args) {

		String s1 = "JavaJ2EE";

		char[] strArray = s1.toCharArray();

		Map<Character, Integer> charMap = new HashMap();

		for (char c : strArray) {

			if (charMap.containsKey(c)) {
				charMap.put(c, charMap.get(c) + 1);

			}

			else {
				charMap.put(c, 1);
			}

		}

		System.out.println(charMap);

	}

}
