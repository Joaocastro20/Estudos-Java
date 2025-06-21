package OracleJava21zo830.Inheritance.AtendimentoClientes;


public class Cliente {
    String nome;
    String local;

    public Cliente(String nome, String local) {
        this.nome = nome;
        this.local = local;
    }

    public String getNome() {
        return nome;
    }

    public String getLocal() {
        return local;
    }
}

