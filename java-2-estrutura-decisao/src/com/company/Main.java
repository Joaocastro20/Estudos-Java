package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
    //estrutura de decisao if, else
	Scanner leitor = new Scanner(System.in);
    System.out.println("Digite um numero e faça verificaçoes:");
    int n = leitor.nextInt();
    if (n > 0){
        System.out.println("o numero "+n+" é positivo");
    }else{
        System.out.println("o numero "+n+" é negativo");
    }
    if(n % 2 == 0){
        System.out.println("o numero "+n+" é par");
    }else{
        System.out.println("o numero "+n+" é impar");
    }

    }
}
