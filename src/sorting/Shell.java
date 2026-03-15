package sorting;

import core.AbstractSort;

public class Shell<T extends Comparable<T>> extends AbstractSort<T> {
    @Override
    public void sort(T[] arr){
        int N = arr.length;
        int h = 1;
        while (h < N/3) h = 3 * h + 1;

        while (h >= 1){
            for (int i = h; i < N; i++){
                for(int j = i; j >= h && less(arr[j], arr[j-h]); j -= h) {
                    exch(arr, j, j - h);
                }
            }
            h /= 3;
        }

        assert isSorted(arr);
    }

    @Override
    public String getName(){
        return "Shell Sort";
    }

    public static void main(String[] args){
        Integer[] arr = new Integer[]{10,4,5,2,1,8,3,6};
        AbstractSort<Integer> shell = new Shell<Integer>();
        shell.sort(arr);
        shell.show(arr);
    }
}
