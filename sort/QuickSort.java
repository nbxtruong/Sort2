package sort;

public class QuickSort<T extends Comparable<? super T>> implements Sort<T> {
	private T[] data;

	public QuickSort() {
	}

	private void swap(int i, int j) {
		T tmp = data[i];
		data[i] = data[j];
		data[j] = tmp;
	}

	private void quickSort(int left, int right) {
		if (left < right) {
			int i = left;
			int j = right + 1;
			while (i < j) {
				while (data[++i].compareTo(data[left]) < 0 && i < right)
					;
				while (data[--j].compareTo(data[left]) > 0)
					;
				if (i < j) {
					swap(i, j);
				}
			}
			swap(left, j);
			quickSort(left, j - 1);
			quickSort(j + 1, right);
		}
	}

	public void doSort(T[] a) {
		data = a;
		quickSort(0, data.length - 1);

	}
}