package core;

public interface sorter<T extends Comparable<T>> {
    void sort(T[] arr);
    String getName();
}
