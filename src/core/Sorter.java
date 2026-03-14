package core;

public interface Sorter<T extends Comparable<T>> {
    void sort(T[] arr);
    String getName();
}
