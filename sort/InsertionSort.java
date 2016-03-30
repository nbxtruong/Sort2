package sort;

public class InsertionSort<T extends Comparable<? super T>> implements Sort<T>  {

	private T[] data;

	public InsertionSort() {
	}

	private void insert(int i) {
		if (i < data.length - 1) {
			if (data[i].compareTo(data[i + 1]) > 0) {
				T tmp = data[i];
				data[i] = data[i + 1];
				data[i + 1] = tmp;
				insert(i + 1);
			}
		}
	}

	public void doSort(T[] a) {
		data = a;
		for (int i = data.length - 2; i >= 0; --i) {
			insert(i);
		}
	}
}
