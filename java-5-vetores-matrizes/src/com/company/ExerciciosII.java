package com.company;

import java.util.Scanner;
        //crie uma lista com 6 itens e mostre todos na tela
public class ExerciciosII {
    public static void main(String[] args) {
        int lista[] = new int[6];
        Scanner entrada = new Scanner(System.in);
        for(int i = 0;i< lista.length;i++){
            System.out.println("digite um numero:");
            lista[i] = entrada.nextInt();
        }
        for(int i = 0;i< lista.length;i++){
            System.out.println(lista[i]);
        }
    }
}
