package sort;

public interface Sort<T extends Comparable<? super T>> {
	public void doSort(T[] a);
}
