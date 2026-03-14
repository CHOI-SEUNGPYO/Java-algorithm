package core;

public abstract class AbstractSort<T extends Comparable<T>> implements Sorter<T> {
    @Override
    public abstract void sort(T[] arr);

    @Override
    public abstract String getName();

    protected boolean less(T v, T w)
    { return v.compareTo(w) < 0; }

    protected void exch(T[] arr, int i, int j)
    { T t = arr[i]; arr[i] = arr[j]; arr[j] = t;}

    public void show(T[] arr){
        for (int i = 0; i < arr.length; i++) System.out.print(arr[i] + " ");
        System.out.println();
    }

    public boolean isSorted(T[] arr){
        for (int i = 1; i < arr.length; i++)
            if (less(arr[i], arr[i-1])) return false;
        return true;
    }
}
