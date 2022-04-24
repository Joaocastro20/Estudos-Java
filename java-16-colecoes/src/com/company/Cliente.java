package com.company;

public class Cliente {
    private String name;
    private int idade;

    public Cliente() {
    }

    public Cliente(String name, int idade) {
        this.name = name;
        this.idade = idade;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
    @Override
    public String toString(){
        return this.name;
    }
}
