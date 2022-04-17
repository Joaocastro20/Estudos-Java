package com.company;

public class ExercicioV {
    public static void main(String[] args) {
        //conferindo quantos pares a em um vetor
        int lista[] = {1,2,3,4,5,6,7,8,9,10,11};
        int pares = 0;
        int impar = 0;
        for(int i = 0;i< lista.length;i++){
            if(lista[i] % 2 ==0){
                pares++;
            }else{
                impar++;
            }
        }
        System.out.println(pares);
        System.out.println(impar);
    }
}
