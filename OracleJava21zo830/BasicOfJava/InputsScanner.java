package OracleJava21zo830.BasicOfJava;

import java.util.Scanner;

public class InputsScanner {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Digite o primeiro numero: ");
        int n1 = input.nextInt();
        System.out.print("Digite o segundo numero: ");
        int n2 = input.nextInt();
        System.out.printf("a somatoria é %d%n", n1 + n2);
    }
}
