package JavaPrograms;

public class ReverseANumber {

	public static void main(String[] args) {

		int num = 1234;
		int rev = 0;
		while (num != 0) {

			int div = num % 10;
			rev = rev * 10 + div;
			num = num / 10;
			

		}

		System.out.println("Reverse of the "+ rev);
	}

}
