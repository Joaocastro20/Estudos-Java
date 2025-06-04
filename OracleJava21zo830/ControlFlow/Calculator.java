package OracleJava21zo830.ControlFlow;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1, num2, result = 0;
        char ope;
        System.out.println("Digite o primeiro numero: ");
        num1 = input.nextInt();
        System.out.println("Digite o segundo numero: ");
        num2 = input.nextInt();
        System.out.println("Digite a operação: ");
        ope = input.next().charAt(0);


        switch (ope){
            case '+' -> result = num1 + num2;
            case '-' -> result = num1 - num2;
            case '/' -> result = num1 / num2;
            case '*' -> result = num1 * num2;
            case '%' -> result = num1 % num2;
            default -> {
                System.out.println("Operador Invalido!");
                break;
            }
        }

        System.out.printf("Resultado: %d", result);

    }
}
