package OracleJava21zo830.Method;

import java.util.Scanner;

public class Exponential {
     static public void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double a, b;
        System.out.println("Digite o numero: ");
        a = input.nextInt();
        System.out.println("Digite a potencia: ");
        b = input.nextInt();
        System.out.println(Math.pow(a, b));
    }
}
