package JavaPrograms;

public class SecondLargest {

	public static void main(String[] args) {
		findSeconLargest();

	}

	public static void findSeconLargest() {
		int firstLargest = Integer.MIN_VALUE, SecondLargest = Integer.MIN_VALUE;

		int arr[] = { 10, 200, 100, 501, 80, 90, 1000 };

		for (int i = 0; i < arr.length; i++) {

			if (arr[i] > firstLargest) {

				SecondLargest = firstLargest;
				firstLargest = arr[i];

			} else if (arr[i] > SecondLargest) {

				SecondLargest = arr[i];
			}

		}

		System.out.println(SecondLargest);

	}

}
