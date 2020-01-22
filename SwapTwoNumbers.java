package JavaPrograms;

import java.util.Scanner;

public class SwapTwoNumbers {

	// Swapping two numbers without using third variable

	public static void main(String[] args) {
		swapTwoNumbers(10, 20);

	}

	public static void swapTwoNumbers(int firstNum, int secondNum) {

		System.out.println("Before Swapping");
		System.out.println("FirstNumb is " + firstNum + " SecondNumb " + secondNum);

		firstNum = firstNum + secondNum;
		secondNum = firstNum - secondNum;
		firstNum = firstNum - secondNum;

		System.out.println("FirstNumb is " + firstNum + " SecondNumb " + secondNum);

	}

}
