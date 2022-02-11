
/**
 * Class Tests
 * 
 * Encargada de realizar los Tests en JUnit
 * 
 * @version 1.0, 10/02/2022
 * 
 * @author 
 * Andres E. Montoya W. - 21552
 * Diego E. Lemus L. - 21469
 * Fernanda Esquivel - 21542
 *
 */

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Tests {

	@Test
	void testBubleSort() {
		Sorting sorting = new Sorting();
		int[] array = {8,2,6,10,4};
		sorting.bubleSort(array);
		assertEquals(10, array[0]);
		assertEquals(8, array[1]);
		assertEquals(6, array[2]);
		assertEquals(4, array[3]);
		assertEquals(2, array[4]);
	}

	@Test
	void testQuickSort() {
		Sorting sorting = new Sorting();
		int[] array = {8,2,6,10,4};
		sorting.quickSort(array, 0, 4);
		assertEquals(10, array[0]);
		assertEquals(8, array[1]);
		assertEquals(6, array[2]);
		assertEquals(4, array[3]);
		assertEquals(2, array[4]);
	}

	@Test
	void testMergeSort() {
		Sorting sorting = new Sorting();
		int[] array = {8,2,6,10,4};
		sorting.mergeSort(array, 0, 4);
		assertEquals(2, array[0]);
		assertEquals(4, array[1]);
		assertEquals(6, array[2]);
		assertEquals(8, array[3]);
		assertEquals(10, array[4]);
	}

	@Test
	void testRadixSort() {
		Sorting sorting = new Sorting();
		int[] array = {8,2,6,10,4};
		sorting.radixSort(array, 5);
		assertEquals(2, array[0]);
		assertEquals(4, array[1]);
		assertEquals(6, array[2]);
		assertEquals(8, array[3]);
		assertEquals(10, array[4]);
	}

	@Test
	void testGnomeSort() {
		Sorting sorting = new Sorting();
		int[] array = {8,2,6,10,4};
		sorting.gnomeSort(array, 5);
		assertEquals(2, array[0]);
		assertEquals(4, array[1]);
		assertEquals(6, array[2]);
		assertEquals(8, array[3]);
		assertEquals(10, array[4]);
	}

}
