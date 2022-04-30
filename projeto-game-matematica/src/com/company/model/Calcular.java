package com.company.model;

import java.util.Random;

public class Calcular {
    private int dificuldade;
    private int valor1;
    private int valor2;
    private int operacao;
    private int resultado;

    public Calcular(int dificuldade) {

        Random rand = new Random();
        this.operacao = rand.nextInt(3);
        this.dificuldade = dificuldade;
        if(dificuldade==1){
            this.valor1 = rand.nextInt(10);
            this.valor2 = rand.nextInt(10);
        }else if(dificuldade==2){
            this.valor1 = rand.nextInt(100);
            this.valor2 = rand.nextInt(100);
        }else if (dificuldade==3){
            this.valor1 = rand.nextInt(1000);
            this.valor2 = rand.nextInt(1000);
        }else if(dificuldade==4){
            this.valor1 = rand.nextInt(10000);
            this.valor2 = rand.nextInt(10000);
        }else{
            this.valor1 = rand.nextInt(1000000);
            this.valor2 = rand.nextInt(1000000);
        }
    }

    public int getDificuldade() {
        return dificuldade;
    }

    public int getValor1() {
        return valor1;
    }

    public int getValor2() {
        return valor2;
    }

    public int getOperacao() {
        return operacao;
    }

    public int getResultado() {
        return resultado;
    }

    public String toString(){
        String op;
        if(this.getOperacao()==0){
            op = "somar";
        }else if (this.getOperacao()==1){
            op = "diminuir";
        }else if(this.getOperacao()==2){
            op = "multiplicar";
        }else{
            op = "operaçao invalida";
        }
        return "valor 1: "+this.getValor1()+
            "\nvalor 2: "+this.getValor2()+
            "\ndifilculdade: "+this.getDificuldade()+
            "\noperacao: "+op;
    }
    public boolean somar(int resposta){
        this.resultado = getValor1() + getValor2();
        boolean certo = false;

        if(resposta==getResultado()){
            System.out.println("Voce acertou!");
            certo = true;
        }else{
            System.out.println("Voce errou!");
        }
        System.out.println(this.getValor1()+"+"+this.getValor2()+"="+this.getResultado());
        return certo;
    }
    public boolean diminuir(int resposta){
        this.resultado = getValor1()-getValor2();
        boolean certo = false;

        if(resposta==getResultado()){
            System.out.println("voce acertou!");
            certo = true;
        }else {
            System.out.println("voce errou");
        }
        System.out.println(this.getValor1()+"-"+this.getValor2()+"="+this.getResultado());
        return certo;
    }
    public boolean multiplicar(int resposta){
        this.resultado = getValor1()*getValor2();
        boolean certo = false;

        if(resposta==getResultado()){
            System.out.println("voce acertou!");
            certo = true;
        }else {
            System.out.println("voce errou");
        }
        System.out.println(this.getValor1()+"x"+this.getValor2()+"="+this.getResultado());
        return certo;
    }
}

