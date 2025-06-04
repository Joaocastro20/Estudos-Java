package OracleJava21zo830.ControlFlow;

import java.util.Random;
import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random random = new Random();
        int numeroAleatorio = random.nextInt(10);
        int numUser = 0;
        do{
            System.out.println("Digite um numero: ");
            numUser = input.nextInt();
        }while (numUser != numeroAleatorio);
        System.out.printf("O numero certo é %d", numUser);
        input.close();
    }
}
