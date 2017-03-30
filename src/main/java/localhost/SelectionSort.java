package localhost;

import java.util.Arrays;

public class SelectionSort {

	private static final boolean DEBUG = false;

	/**
	 * Selection sort.
	 * <p>
	 * Time complexity: O(n2)
	 * <p>
	 * Good:
	 * - Space efficient.
	 * <p>
	 * Bad:
	 * - High cpu time.
	 * - High number of writes.
	 * - Not a stable sort -- equal elements may be re-arranged.
	 * - Uses O(1) extra space for temp storage.
	 * - Not adaptive -- does not stop early if the array is sorted before sorting is complete.
	 *
	 * @param array The array to sort.
	 * @return The same array, sorted.
	 */
	public static int[] sort(int[] array) {
		for (int i = 0; i < array.length; i++) {
			if (DEBUG) System.out.println("Position: " + i);

			// Check all remaining elements against position i, left to right.
			for (int j = i + 1; j < array.length; j++) {
				if (array[j] < array[i]) {
					// Element at position j is lesser than i. Swap the two elements.
					swapElements(array, i, j);

					if (DEBUG) printArray(array);
				}
			}
		}

		return array;
	}

	/**
	 * Swap the position of two elements in an array, in-place.
	 *
	 * @param array The array.
	 * @param i     The first element's position index.
	 * @param j     The second element's position index.
	 * @return The same array given. We return a value for unit testing.
	 */
	protected static int[] swapElements(int[] array, int i, int j) {
		int temp = array[i];
		array[i] = array[j];
		array[j] = temp;

		return array;
	}

	/**
	 * Print the contents of an array.
	 *
	 * @param array The array to print.
	 * @return The printed string. We return a value for unit testing.
	 */
	protected static String printArray(int[] array) {
		String message = "During: " + Arrays.toString(array);
		System.out.println(message);

		return message;
	}

}
