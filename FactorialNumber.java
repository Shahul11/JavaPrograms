package JavaPrograms;

public class FactorialNumber {

	public static void main(String[] args) {
		itervativeMethod();
	}

	public static void itervativeMethod() {

		int num = 5;
		int fact = 1;

		for (int i = 1; i <= num; i++) {

			fact = fact * i;

		}
		System.out.println(fact);
	}
}