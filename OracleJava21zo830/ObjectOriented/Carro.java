package OracleJava21zo830.ObjectOriented;

public class Carro {
    int velocidade;
    boolean movimento;

    public Carro(int velocidade, boolean movimento) {
        this.velocidade = velocidade;
        this.movimento = movimento;
    }

    public int getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(int velocidade) {
        this.velocidade = velocidade;
    }

    public boolean isMovimento() {
        return movimento;
    }

    public void setMovimento(boolean movimento) {
        this.movimento = movimento;
    }

    protected void start(){
        setVelocidade(10);
        setMovimento(true);
    }
}
