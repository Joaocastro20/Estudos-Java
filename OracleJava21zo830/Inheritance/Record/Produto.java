package OracleJava21zo830.Inheritance.Record;


public record Produto(String nome, double preco) {
    public Produto {
        if (preco < 0) {
            throw new IllegalArgumentException("Preço não pode ser negativo");
        }
    }

    public String descricao() {
        return nome + " custa R$ " + preco;
    }
}
