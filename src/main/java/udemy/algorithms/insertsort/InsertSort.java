package udemy.algorithms.insertsort;

/**
 * Insert Sort Algorithm
 * This algorithm performs well sorting a small set of data. It compares the current number with the 
 * previous element of the array and swap if it is smaller. 
 * 
 * @author Marcos
 *
 */
public class InsertSort {

	public int[]  sort(int[] array) {
		for (int c=1; c<array.length; c++) {
			for (int i=c; i > 0; i--) {
				if (array[i] < array[i-1]) {
					swap(array, i, i-1);
				}
			}
		}
		return array;
	}
	
	void swap(int[] array, int i, int j) {
		int temp = array[i];
		array[i] = array[j];
		array[j] = temp;
	}
}
