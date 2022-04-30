package com.company.defaltmethods;

public interface Testando {

    int  valor = 9;

    public String mensagem();

    default void metodo(){
        System.out.println("opa...");
    }
}
