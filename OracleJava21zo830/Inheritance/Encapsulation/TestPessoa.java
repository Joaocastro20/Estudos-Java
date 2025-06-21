package OracleJava21zo830.Inheritance.Encapsulation;

public class TestPessoa {
    public static void main(String[] args) {
        Analista analista = new Analista("fulano", 33, "front");
        System.out.println(analista.getOcupation());
    }
}
