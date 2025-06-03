package OracleJava21zo830.Array;

import java.lang.reflect.Array;
import java.util.Arrays;

public class SearchingArray {
    public static void main(String[] args) {
        int[] numeros = { 2, 3, 8, 24, 39};
        Arrays.sort(numeros);
        System.out.println(Arrays.binarySearch(numeros, 1));

        String[] animals = { "dog", "cat", "elephant", "lion", "tiger", "giraffe" };
        System.out.println(Arrays.binarySearch(animals, "lion"));
        Arrays.sort(animals);
        System.out.println(Arrays.toString(animals));
        System.out.println(Arrays.binarySearch(animals, "ZIM"));
    }
}
