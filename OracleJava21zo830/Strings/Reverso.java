package OracleJava21zo830.Strings;

import java.util.Scanner;

public class Reverso {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a palavra pra ver seu inverso: ");
        StringBuilder palavra = new StringBuilder(scanner.next());
        System.out.println("O Inverso é: " + palavra.reverse());

//        int count = 5;
//        String car = "ferrari";
//        String car2 = count + 1;

    }
}
