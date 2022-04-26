package com.company;

import java.util.Arrays;

public class Vetor {
    private Aluno alunos[] = new Aluno[100];
    private int total = 0;

    /** adiciona um novo aluno do parametro
     *
     * @param aluno
     */
    public void adicionar(Aluno aluno){
        this.alunos[total] = aluno;
        total ++;
    }

    /** adiciona um aluno em uma posicao especifica
     *
     * @param posicao
     * @param aluno
     */
    public void adicionar(int posicao, Aluno aluno){
        this.alunos[posicao] = aluno;
    }



    /** pega posição caso ela seja valida
     *
     * @param posicao
     * @return
     */
    public Aluno pega(int posicao){
        if(!posicaoOcupada(posicao)){
            throw new IllegalArgumentException("posiçao invalida");
        }
            return this.alunos[posicao];
    }

    /** remove o aluno passado no parametro
     *
     * @param posicao
     */
    public void remove(int posicao){
        this.alunos[posicao] = null;
    }

    /** verifica se ha determinado aluno na lista
     *
     * @param aluno
     * @return
     */
    public boolean verificar(Aluno aluno){
        for(int i = 0;i< total;i++){
            if(aluno.equals(alunos[i])){
                return true;
            }
        }
        return false;
    }

    /** ler o tamanho do vetor
     *
     * @return
     */
    public int tamanho(){
        return this.total ;
    }
    @Override
    public String toString(){
        return Arrays.toString(this.alunos);
    }
    private boolean posicaoOcupada(int posicao){
        return posicao >= 0 && posicao < total;
    }
}
