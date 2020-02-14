package JavaPrograms;

public class PushZeroes {

	public static void main(String[] args) {

		int arr[] = { 34, 7, 0, 9, 7, 0, 12, 11 };
		int len = arr.length;

		pushZeroes(arr, len);
		System.out.println("After Moving the zeroes");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");

		}

	}

	public static void pushZeroes(int[] arr, int len) {

		int counter = 0;

		for (int i = 0; i < arr.length; i++) {

			if (arr[i] != 0) {
				arr[counter++] = arr[i];
			}

		}

		while (counter < len) {
			arr[counter++] = 0;
		}

	}
}
