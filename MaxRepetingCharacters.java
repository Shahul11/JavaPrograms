package JavaPrograms;

public class MaxRepetingCharacters {

	public static void main(String[] args) {
		String str = "aaaabbaaccde";
		maxRepeatingCharacters(str);

	}

	public static void maxRepeatingCharacters(String str) {

		int len = str.length();
		int count = 0;
		char res = str.charAt(0);
		for (int i = 0; i < len; i++) {
			int cur_count = 1;

			for (int j = 0; j < len; j++) {

				if (i != j && str.charAt(i) != str.charAt(j)) {
					break;
				} else {
					cur_count++;
				}

			}

			if (cur_count > count) {
				count = cur_count;
				res = str.charAt(i);
			}

		}

		System.out.println(res);

	}

}
