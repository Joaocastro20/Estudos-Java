package OracleJava21zo830.BasicOfJava;

import java.util.Scanner;

public class Numbers {
    public static void main(String[] args) {
        boolean controle = true;
        while (controle){
            Scanner input = new Scanner(System.in);
            System.out.print("Digite um numero: ");
            int number = input.nextInt();
            String binario = Integer.toBinaryString(number);
            String octal = Integer.toOctalString(number);
            String hexa = Integer.toHexString(number);
            System.out.println("Binario: " + binario);
            System.out.println("Octal: " + octal);
            System.out.println("Hexa: " + hexa);
            System.out.println("Deseja continuar: ");
            int opcao = input.nextInt();
            controle = opcao != 0;
        }

    }
}
