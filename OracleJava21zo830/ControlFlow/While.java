package OracleJava21zo830.ControlFlow;

import java.util.Random;
import java.util.Scanner;

public class While {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random random = new Random();
        boolean control = false;
        int numeroAleatorio = random.nextInt(10);
        int numUser = 0;
        System.out.println("Tente acertar o numero de 1 a 10: ");
        while (numeroAleatorio != numUser){
            if(control){
                System.out.println("Tente Novamente:");
            }
            numUser = input.nextInt();
            control = true;
        }
        System.out.println("o Numero era: " + numUser);
    }
}
