public class Pessoas {
    String nome;
    int idade;
    double altura;

    public Pessoas(String nome, int idade, double altura) {
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
    }

    void mostrar_dados(){
        System.out.println(this.nome);
        System.out.println(this.idade);
        System.out.println(this.altura);

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
}
