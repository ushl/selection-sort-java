package localhost;

import localhost.SelectionSort;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class SelectionSortTest {

	@Test
	public void sort() throws Exception {
		int[] sorted = SelectionSort.sort(new int[]{6, 4, 9, 2, 10, 1, 8, 7, 5, 3});

		Assert.assertEquals(
				Arrays.toString(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}),
				Arrays.toString(sorted)
		);
	}

	@Test
	public void swapElements() throws Exception {
		int[] unsorted = new int[]{1, 2, 4, 3, 5};

		int[] sorted = SelectionSort.swapElements(unsorted, 2, 3);

		Assert.assertEquals(
				Arrays.toString(new int[]{1, 2, 3, 4, 5}),
				Arrays.toString(sorted)
		);
	}

	@Test
	public void printArray() throws Exception {
		String message = SelectionSort.printArray(new int[]{1, 2, 3, 4, 5});

		Assert.assertEquals("During: [1, 2, 3, 4, 5]", message);
	}

}