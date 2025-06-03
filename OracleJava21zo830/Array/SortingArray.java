package OracleJava21zo830.Array;

import java.util.Arrays;

public class SortingArray {
    public static void main(String[] args) {
        char[] letras = {'e', 'a', 'w', 'y', 'b', 'A', 'C'};
        Arrays.sort(letras);
        System.out.println(Arrays.toString(letras));

        String[] palavras = {"cat", "monkey", "dog", "bird", "Zeus"};
        Arrays.sort(palavras);
        System.out.println(Arrays.toString(palavras));

        String[] numeros = {"1", "10", "25", "50", "100", "ant", "Zebra"};
        Arrays.sort(numeros);
        System.out.println(Arrays.toString(numeros));
    }
}
