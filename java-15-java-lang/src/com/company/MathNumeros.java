package com.company;

import java.util.Scanner;

public class MathNumeros {
    //java lang
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int a = 1;
        int b = 2;
        System.out.println(Math.subtractExact(a,b));
        System.out.println(Math.addExact(a,b));
        System.out.println(Math.floorMod(a,b));
        System.out.println(Math.PI);
        System.out.println(Math.round(Math.PI));

    }
}
