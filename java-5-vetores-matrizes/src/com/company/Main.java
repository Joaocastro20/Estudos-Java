package com.company;

public class Main {

    public static void main(String[] args) {
	int numeros[] = {1,3,5,7,9};
    int auto[] = new int[10];
    for(int i = 0;i < auto.length;i++ ){
        auto[i] = i + 5 ;

    }
        System.out.println(auto[0]);
        System.out.println(auto[9]);
    }
}
