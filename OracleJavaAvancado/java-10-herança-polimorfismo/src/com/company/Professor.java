public class Professor extends Pessoa{
    private int matricula;
    private String materia;

    public Professor(String nome, int ano_nascimento, int matricula, String materia) {
        super(nome, ano_nascimento);
        this.matricula = matricula;
        this.materia = materia;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }
    public String toString(){
        return super.toString()+ "\n matricula:"+this.matricula+"\n materia:"+this.materia;
    }
}
