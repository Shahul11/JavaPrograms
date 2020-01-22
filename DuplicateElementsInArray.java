package JavaPrograms;

import java.util.HashSet;
import java.util.Set;

public class DuplicateElementsInArray {

	public static void main(String[] args) {
		printduplicatesinArray();

	}

	public static void printduplicatesinArray() {
		int[] arr = { 10, 20, 30, 40, 50, 60, 10, 80, 60, 50 };

		Set<Integer> hs = new HashSet<Integer>();

		for (int i = 0; i < arr.length - 1; i++) {

			if (!hs.add(arr[i])) {

				System.out.println("Duplicate Elements are " + arr[i]);
			} else {
				hs.add(arr[i]);
			}
		}
		System.out.println("+++++++++++");
		for (Integer singleValue : hs) {
			System.out.print(singleValue + " ");
		}

	}

}
