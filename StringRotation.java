package JavaPrograms;

public class StringRotation {

	public static void main(String[] args) {

		String s1 = "abcde";
		String s2 = "deabc";

		if (s1.length() != s2.length()) {
			System.out.println("Not a rotation");
		} else {
			s1 = s1.concat(s1);
			if (s1.indexOf(s2) != -1) {
				System.out.println("String is rotated");
			} else {
				System.out.println("String is not rotated");
			}
		}
	}

}
