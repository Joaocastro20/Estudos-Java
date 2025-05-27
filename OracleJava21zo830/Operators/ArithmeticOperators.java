package OracleJava21zo830.Operators;

import java.util.Scanner;

public class ArithmeticOperators {
    public static void main(String[] args) {
        int a;
        int b;
        String operat;
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o primeiro numero: ");
        a = input.nextInt();
        System.out.println("Digite o segundo numero: ");
        b = input.nextInt();
        System.out.println("Digite a operacao: ");
        operat = input.next();
        switch (operat){
            case "+":
                System.out.println(a + b);
                break;
            case "-":
                System.out.println(a - b);
                break;
            case  "*":
                System.out.println(a * b);
                break;
            case "/":
                System.out.println(a / b);
                break;
            case "r":
                System.out.println(a % b);
                break;
        }
    }
}
