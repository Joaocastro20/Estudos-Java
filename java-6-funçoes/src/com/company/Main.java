package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("informe a quantidade de frutas:");
        Scanner teclado = new Scanner(System.in);
        int quantidade = Integer.parseInt(teclado.nextLine());
        String lista[] = new String[quantidade];

        for(int i = 0;i< lista.length;i++){
            System.out.println("digite a fruta:");
            lista[i] = teclado.nextLine();
        }
        System.out.println("voce salvou "+lista.length);


    }
}
