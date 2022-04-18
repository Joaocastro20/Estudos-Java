package com.company;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class ExerciciosVI {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int lista[] = new int[10];
        for(int i = 0;i< lista.length;i++){
            System.out.println("digite:");
            lista[i] = entrada.nextInt();
        }
        Arrays.stream(lista).sorted();
        for(int i = 0;i< lista.length;i++){
            System.out.println(lista[i]);

        }

    }
}
