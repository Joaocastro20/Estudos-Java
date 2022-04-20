package com.company;

public class ExerciciosIII {
    public static void main(String[] args) {
        System.out.println(impopar(2));
        System.out.println(posneg(2));
    }
    static int impopar(int a){
        int res = 0;
        if(a % 2 == 0){
            res = 1 ;
        }else{
            res = -1;
        }
        return  res;
    }
    static int posneg(int b){
        int res = 0;
        if(b<0){
            res = -1;
        }else {
            res = 1;
        }
        return res;
    }
}
