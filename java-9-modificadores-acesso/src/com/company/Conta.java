package com.company;

public class Conta {
    int conta;
    private double saldo;
    private double limite;
    Cliente cliente;

    public Conta(int conta, double saldo, double limite, Cliente cliente) {
        this.conta = conta;
        this.saldo = saldo;
        this.limite = limite;
        this.cliente = cliente;
    }

    void sacar(double valor){
        if((this.saldo + this.limite) >= valor) {
            this.saldo = (this.saldo + this.limite) - valor;
        }else{
            System.out.println("voce nao tem saldo suficiente");
        }
    }

    void depositar(double valor){
        this.saldo = this.saldo + valor;
    }

    public int getConta() {
        return conta;
    }

    public void setConta(int conta) {
        this.conta = conta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
}
