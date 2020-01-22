package JavaPrograms;

import java.util.Arrays;

public class Anagram {

	/**
	 * 1. Replace all the spaces with empty
	 * 2. Convert to all in lower case and two character array
	 * 3. Use the Array.sort()
	 * 4. Then use the Array.equals() method
	 * 
	 */
	public static void main(String[] args) {

		ananGramString("Mother In Law", "Hitler Woman");

	}

	public static void ananGramString(String s1, String s2) {

		String copyOfs1 = s1.replaceAll(" ", "");

		String copyOfs2 = s2.replaceAll(" ", "");

		boolean status = true;

		if (copyOfs1.length() == copyOfs2.length()) {

			char[] charArray1 = copyOfs1.toLowerCase().toCharArray();
			char[] charArray2 = copyOfs2.toLowerCase().toCharArray();

			Arrays.sort(charArray1);
			Arrays.sort(charArray2);
			status = Arrays.equals(charArray1, charArray2);

		} else {

			status = false;

		}

		if (status) {
			System.out.println("Arrays are anagram");
		} else {
			System.out.println("Arrays are not anagram");
		}

	}

}
