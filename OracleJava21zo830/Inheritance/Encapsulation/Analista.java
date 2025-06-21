package OracleJava21zo830.Inheritance.Encapsulation;

public class Analista extends Pessoa{

    private String ocupation;

    public Analista(String nome, int idade, String ocupation) {
        super(nome, idade);
//        this.ocupation = ocupation;
    }

    public String getOcupation() {
        return ocupation;
    }

    public void setOcupation(String ocupation) {
        this.ocupation = ocupation;
    }
}
