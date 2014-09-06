/* Sorter class
 * Author - Charles Rusk
 * Date: 9/4/14
*/

public class Sorter<T extends Comparable<T>> {

	public void selectionSort(T[] items) {
		//data used to analyze effiecency of sorting algorithm
		long compareCount = 0; //long b/c int only goes to 2 billion
		long swapCount = 0;

		for (int j = 0; j < items.length - 1; j++) {
			int min = j;
			for( int k = j+1; k < items.length - 1; k++) {
				compareCount ++;
				if(items[k].compareTo(items[min]) < 0) {
					min = k;
				}
			}
			if(min != j) {
				//swap
				T temp = items[j];
				items[j] = items[min];
				items[min] = temp;
				swapCount ++;
			}
		}
		System.out.println("compares: " + compareCount);
		System.out.println("swaps: " + swapCount);
	}
}
