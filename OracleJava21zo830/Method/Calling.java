package OracleJava21zo830.Method;

import java.util.Scanner;

public class Calling {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1, num2;
        System.out.println("Digite o primeiro numero: ");
        num1 = input.nextInt();
        System.out.println("Digite o segundo numero: ");
        num2 = input.nextInt();
        int result = somar(num1, num2);
        System.out.println("Resultado: " +result);
    }

    public static int somar(int x,int y ){
        return x + y;
    }
}
