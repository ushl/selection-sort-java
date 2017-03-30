package localhost;

import java.util.Arrays;


/**
 * Demo our selection sort implementatin.
 */
public class Application {

	public static void main(String[] args) {

		int numbers[] = new int[]{6, 4, 9, 2, 10, 1, 8, 7, 5, 3};

		System.out.println("Before: " + Arrays.toString(numbers));

		SelectionSort.sort(numbers);

		System.out.println("After : " + Arrays.toString(numbers));

	}

}
