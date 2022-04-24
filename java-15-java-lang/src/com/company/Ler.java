package com.company;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Ler {
    public static void main(String[] args) {


        try {
            Scanner ler = new Scanner(new FileInputStream("saida.txt"));
            System.out.println(ler.nextLine());
        }catch (FileNotFoundException e){
            System.out.println("arquivo nao encontrado");
        }
    }
}
