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
        this.garantirEspaco();
        this.alunos[total] = aluno;
        total ++;
    }

    /** adiciona um aluno em uma posicao especifica
     *
     * @param posicao
     * @param aluno
     */
    public void adicionar(int posicao, Aluno aluno){
        this.garantirEspaco();
        if(!posicaoOcupada(posicao)){
            throw new IllegalArgumentException("posição invalida!");
        }
        for(int i = total - 1;i>=posicao;i-=1){
            alunos[i+1] = alunos[i];
        }
        alunos[posicao] = aluno;
        total++;

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
     for(int i = posicao; i < this.total;i++){
         this.alunos[i] = this.alunos[i+1];
     }
     total--;
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
    private void garantirEspaco(){
        if(total == alunos.length){
            Aluno novoArray[] = new Aluno[alunos.length*2];
            for(int i = 0;i<alunos.length;i++){
                novoArray[i] = alunos[i];
            }
            this.alunos = novoArray;
        }
    }
}
