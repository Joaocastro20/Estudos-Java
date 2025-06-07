package OracleJava21zo830.ObjectOriented;

public class Construtor {
    public static void main(String[] args) {
        Carro carro1 = new Carro(0, false);
        Carro carro2 = new Carro();
        carro1.start();
        System.out.println("O carro 1 esta " + carro1.velocidade + "Km/h e " + (carro1.movimento? "em movimento" : "parado"));
        System.out.println("O carro 2 esta " + carro2.velocidade + "Km/h e " + (carro2.movimento? "em movimento" : "parado"));
    }
}

