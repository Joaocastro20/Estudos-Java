package com.company;

import java.util.Scanner;

public class Divisao {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("informe o primeiro numero:");
        int num1 = teclado.nextInt();

        System.out.println("informe o segundo numero:");
        int num2 = teclado.nextInt();
        try {
            System.out.println("a divisao entre "+num1+" e "+num2+" é: "+num1/num2);
        }catch (ArithmeticException e){
            System.out.println("voce esta tentando dividir por 0");
        }finally {
            System.out.println("faça isso tambem...");
        }

    }
}
