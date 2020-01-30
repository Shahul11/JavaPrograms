package JavaPrograms;

public class CountVowelConsonant {

	public static void main(String[] args) {

		String str = "This is a really simple sentence";
		String strCopy= str.toLowerCase();
		int vCount = 0;
		int cCount = 0;

		for (int i = 0; i < str.length(); i++) {

			if (strCopy.charAt(i) == 'a' || strCopy.charAt(i) == 'e' || strCopy.charAt(i) == 'i' || strCopy.charAt(i) == 'o'
					|| strCopy.charAt(i) == 'u') {
				vCount++;
			}  else if(strCopy.charAt(i) >= 'a' && strCopy.charAt(i)<='z'){
				cCount++;
			}

		}

		System.out.println("Number of vowels is " + vCount + " Number or constants " + cCount);
	}

}
