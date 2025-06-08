package OracleJava21zo830.ObjectOriented;

public class Externa {
    class Interna {
        void mostrar() {
            System.out.println("Classe interna (não estática)");
        }
    }

    public static void main(String[] args) {
        Externa externa = new Externa();
        Externa.Interna interna = externa.new Interna();
        interna.mostrar();
    }
}

