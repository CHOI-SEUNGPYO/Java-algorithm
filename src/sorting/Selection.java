package sorting;

import core.AbstractSort;

public class Selection<T extends Comparable<T>> extends AbstractSort<T> {
    public void sort(T[] arr) {
        int N = arr.length;

        for(int i = 0; i < N; ++i) {
            int min = i;

            for(int j = i + 1; j < N; ++j) {
                if (this.less(arr[j], arr[min])) {
                    min = j;
                }
            }

            this.exch(arr, i, min);
        }

    }

    public String getName() {
        return "Selection Sort";
    }

    public static void main(String[] args) {
        Integer[] a = new Integer[]{10, 4, 5, 2, 1, 8, 3, 6};
        AbstractSort<Integer> selection = new Selection<Integer>();
        selection.sort(a);
        selection.show(a);
    }
}