import sort.InsertionSort;
import sort.QuickSort;
import sort.Sort;

/*
 * Created on 24 oct. 2004
 *
 */

/**
 * @author baudon
 * 
 */
public class TestSort {

	public static <T extends Comparable<? super T>> void sortAndPrintArray(
			T[] a, Sort<T> sort) {
		sort.doSort(a);
		for (T t : a) {
			System.out.print(t + " ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		String[] args2 = new String[args.length];
		System.arraycopy(args, 0, args2, 0, args.length);
		sortAndPrintArray(args2, new InsertionSort<String>());
		System.arraycopy(args, 0, args2, 0, args.length);
		sortAndPrintArray(args2, new QuickSort<String>());
	}

}
