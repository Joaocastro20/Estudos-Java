package OracleJava21zo830.BasicOfJava;

import java.util.Scanner;

public class ExerciseBasicOfJava {
    public static void main(String[] args) {
        String fisrtName;
        String lastName;

        Scanner input = new Scanner(System.in);
        System.out.println("digite o primeiro nome:");
        fisrtName = input.next();
        System.out.println("digite o seu sobrenome:");
        lastName = input.next();
        System.out.println("Seu nome completo é: "+ fisrtName + " " + lastName);
    }
}
