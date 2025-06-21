package OracleJava21zo830.Inheritance.AnonymousClass;

public class TestAnonymous {

    public static void main(String[] args) {
        Runnable tarefa = new Runnable() {
            @Override
            public void run() {
                System.out.println("Executando tarefa...");}
        };

        tarefa.run();

        Saudacao saudacao = new Saudacao() {
            @Override
            void dizerOla() {
                System.out.println("Ola");
            }
        };
        saudacao.dizerOla();

    }

}
