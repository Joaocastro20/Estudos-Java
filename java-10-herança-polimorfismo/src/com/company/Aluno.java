package com.company;

public class Aluno extends Pessoa  {
    private int matricula;
    private int turma;

    public Aluno(String nome, int ano_nascimento, int matricula, int turma) {
        super(nome, ano_nascimento);
        this.matricula = matricula;
        this.turma = turma;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public int getTurma() {
        return turma;
    }

    public void setTurma(int turma) {
        this.turma = turma;
    }
    public String toString(){
        return super.toString()+ "\n matricula:"+this.matricula+"\n turma:"+this.turma;
    }
}
