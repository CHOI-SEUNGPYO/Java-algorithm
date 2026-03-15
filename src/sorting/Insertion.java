package sorting;

import core.AbstractSort;

public class Insertion<T extends Comparable<T>> extends AbstractSort<T> {
    @Override
    public void sort(T[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; i++){
            for (int j = i; j > 0 && less(arr[j], arr[j-1]); j--){
                exch(arr, j, j-1);
            }
        }
        assert isSorted(arr);
    }

    @Override
    public String getName() {
        return "Insertion";
    }

    public static void main(String[] args) {
        Integer[] arr = new Integer[]{10,4,5,2,1,8,3,6};
        AbstractSort<Integer> insertion = new Insertion<Integer>();
        insertion.sort(arr);
        insertion.show(arr);
    }
}
