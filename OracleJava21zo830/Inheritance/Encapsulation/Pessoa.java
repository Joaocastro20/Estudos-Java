package OracleJava21zo830.Inheritance.Encapsulation;

public class Pessoa {
    private String nome;
    private int idade;

//    public Pessoa() {
//    }

    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    // Getter
    public String getNome() {
        return nome;
    }

    // Setter
    public void setNome(String nome) {
        this.nome = nome;
    }

    // Getter
    public int getIdade() {
        return idade;
    }

    // Setter com regra de validação
    public void setIdade(int idade) {
        if (idade >= 0) {
            this.idade = idade;
        }
    }
}
