package JavaPrograms;

public class NonRepeatingCharacter {

	public static void main(String[] args) {
		String str1 = "gibblegabbler";

		for (int i = 0; i < str1.length(); i++) {
			boolean unique = true;
			for (int k = 0; k < str1.length(); k++) {

				if (i != k && str1.charAt(i) == str1.charAt(k)) {

					unique = false;
					break;
				}

			}
			if (unique) {
				System.out.println("Non repeating characters are " + str1.charAt(i));
				break;
			}

		}

	}

}

