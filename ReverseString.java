package JavaPrograms;

public class ReverseString {

	public static void main(String[] args) {
		String s1 = " Hello World";
		char[] char1= s1.toCharArray();
		
		
		for (int i = s1.length() - 1; i >= 0; i--) {
			
			System.out.print(char1[i]);

		}

	}

}
