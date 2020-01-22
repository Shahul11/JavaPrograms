package JavaPrograms;

public class FactorialNumber {

	public static void main(String[] args) {
		itervativeMethod();
		System.out.println("==============");
		int value=recursionFactorial(5);
		System.out.println(value);
	}

	public static void itervativeMethod() {

		int num = 5;
		int fact = 1;

		for (int i = 1; i <= num; i++) {

			fact = fact * i;

		}
		System.out.println(fact);
	}
	
	
	
	public static int  recursionFactorial(int num)
	{
		
		int fact=1;
		
		if(num>=1)
		
			return num * recursionFactorial(num-1);
		else
			return 1;
		
	}
}