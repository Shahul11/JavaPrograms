package JavaPrograms;

public class SeparateAlphabetsAndDigitsFromString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		seperatDigitsandNumbers("abAb2359914EGDFadd");
	}

	public static void seperatDigitsandNumbers(String str) {
		String number = "";
		String letters = "";

		for (int j = 0; j < str.length(); j++) {
			char ch = str.charAt(j);

			if (Character.isDigit(ch)) {
				number = number + ch;
			}

			else {

				letters = letters + ch;
			}

		}

		System.out.println("Letters are  " + letters);
		System.out.println("Nubmers are " + number);
	}

}