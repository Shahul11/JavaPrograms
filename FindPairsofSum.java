package JavaPrograms;

public class FindPairsofSum {

	public static void main(String[] args) {

		findPairs(new int[] { 4, 6, 5, -10, 8, 5, 20 }, 10);

	}

	static void findPairs(int[] inputArray, int sum) {

		for (int i = 0; i < inputArray.length; i++) {

			for (int j = i + 1; j < inputArray.length; j++) {

				if (inputArray[i] + inputArray[j] == sum) {
					System.out.println("Paris are " + inputArray[i] + ", " + inputArray[j]);
				}

			}
		}

	}

}
