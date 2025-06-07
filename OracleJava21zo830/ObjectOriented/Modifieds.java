package OracleJava21zo830.ObjectOriented;

public class Modifieds {
    public static void main(String[] args) {
        Modifieds modifieds = new Modifieds();
        modifieds.privado();
    }

    /**
     * visivel em mesma classe e em classes no esmo pacote
     */
    void padrao(){
        System.out.println("Padrao");
    }

    /**
     * visivel em todo o projeto
     */
    public void publico(){
        System.out.println("Publico");
    }

    /**
     * visivel na mesma classe, em classes do mesmo pacote e em subclasses
     */
    protected void protegido(){
        System.out.println("Protegido");
    }

    /**
     * visivel apenas na classe declarada
     */
    private void privado(){
        System.out.println("Privado");
    }
}
