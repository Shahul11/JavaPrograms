package JavaPrograms;

public class Fibonacci {

	public static void main(String[] args) {

		fibNumSeries(10);

	}

	public static void fibNumSeries(int num) {

		int a = 0, b = 1, c;
		System.out.println(a + " ," + b);
		for (int i = 1; i <=num; i++) {
			c = a + b;
			System.out.print(c + " ");
			a = b;
			b = c;

		}

	}

}
