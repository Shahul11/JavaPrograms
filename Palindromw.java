package JavaPrograms;

public class Palindromw {

	public static void main(String[] args) {
		//palindrome("Tiger");
		palindrome("bob");

	}

	public static void palindrome(String inputStr) {

		String orginalString = inputStr;
		char[] stringArray = inputStr.toCharArray();
		String rev = "";

		for (int i = stringArray.length - 1; i >= 0; i--) {

			rev = rev + stringArray[i];
			//System.out.print(rev);

		}
		if (orginalString.equals(rev)) {
			System.out.println("Palindrome");
		} else {
			System.out.println("Not Palindrome");
		}

	}

}
