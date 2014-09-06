import java.util.Random;

public class SortTest {
	public static void main(String[] args) {
		Integer[] numbers = new Integer[100000];
		Random rand = new Random(999);
		
		for(int i = 0; i < numbers.length; i ++)
		{
			numbers[i] = rand.nextInt(20);
			//System.out.print(numbers[i] + ", ");
		}		
		System.out.println();
		long start = System.currentTimeMillis();
		long start2 = System.nanoTime();

		Sorter<Integer> sorter = new Sorter<Integer>();
		sorter.selectionSort(numbers);

		long end = System.currentTimeMillis();
		long end2 = System.nanoTime();
		System.out.println("running time: " + (end - start));
		System.out.println("nano running time: " + (end2 - start2));		
	}
}
