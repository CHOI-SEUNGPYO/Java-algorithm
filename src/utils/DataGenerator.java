package utils;

import java.util.Random;

public class DataGenerator {
    private static final Random rand = new Random();
    // craete random array
    public static Integer[] generateRandom(int size, int max){
        Integer[] arr = new Integer[size];
        for(int i = 0; i < size; i++){
            arr[i] =  rand.nextInt();
        }
        return arr;
    }

    // craete sorted array
    public static Integer[] generateSorted(int size, int max){
        Integer[] arr = new Integer[size];
        for(int i = 0; i < size; i++){
            arr[i] =  i;
        }
        return arr;
    }

    // craete reverse array
    public static Integer[] generateReverse(int size, int max){
        Integer[] arr = new Integer[size];
        for(int i = 0; i < size; i++){
            arr[i] =  size - i - 1;
        }
        return arr;
    }


}
