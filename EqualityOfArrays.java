package JavaPrograms;

public class EqualityOfArrays {

	public static void main(String[] args) {

		int[] arrayOne = { 2, 5, 1, 7, 4 };

		int[] arrayTwo = { 2, 5, 1, 7, 4 };

		boolean arrayEquality = true;

		if (arrayOne.length == arrayTwo.length) {

			for (int i = 0; i < arrayOne.length; i++) {

				if (arrayOne[i] != arrayTwo[i]) {
					arrayEquality = false;
					break;

				}

			}

		}

		else {
			System.out.println(" No two arrays are not equal");
		}

		if (arrayEquality) {
			System.out.println("Arrays are Equal!!");

		} else {
			System.out.println("Arrays are not equal");
		}

	}

}
