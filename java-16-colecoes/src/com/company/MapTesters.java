package com.company;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MapTesters {
    public static void main(String[] args) {
        Map<Integer, String> pessoas = new HashMap<Integer,String>();
        Scanner teclado = new Scanner(System.in);

        for(int i = 0;i <= 5;i++){
            pessoas.put(i,teclado.nextLine());
        }
        pessoas.keySet().forEach(nome -> {
            System.out.println(pessoas.get(nome));
        });
        System.out.println(pessoas.entrySet());

    }
}
