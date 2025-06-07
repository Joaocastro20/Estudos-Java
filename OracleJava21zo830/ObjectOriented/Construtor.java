package OracleJava21zo830.ObjectOriented;

public class Construtor {
    public static void main(String[] args) {
        Carro carro1 = new Carro(0, false);
        carro1.start();
        System.out.println("O carro esta " + carro1.velocidade + "Km/h e " + (carro1.movimento? "em movimento" : "parado"));
    }
}

