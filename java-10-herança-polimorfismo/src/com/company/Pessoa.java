package com.company;

public abstract class  Pessoa {
    private String nome;
    private int ano_nascimento;

    /* permite que o objeto seje iniciado sem parametros
    public Pessoa() {
    }
     */

    public Pessoa(String nome, int ano_nascimento) {
        this.nome = nome;
        this.ano_nascimento = ano_nascimento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getAno_nascimento() {
        return ano_nascimento;
    }

    public void setAno_nascimento(int ano_nascimento) {
        this.ano_nascimento = ano_nascimento;
    }
    public String toString(){
        return "nome:"+this.nome+"\n ano:"+this.ano_nascimento;
    }
}
