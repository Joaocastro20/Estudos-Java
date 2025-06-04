package OracleJava21zo830.ControlFlow;

public class Break {
    public static void main(String[] args) {
        int a = 1;
        switch (a){
            case 1:
                System.out.println("1");
            case 2:
                System.out.println("2");
                break;
        }

        for(int i = 0;i <= 15; i++){
            System.out.println(i);
            if(i == 5) break;
        }

        String[] animais = {"Cachorro", "Gato", "Elefante", "Leão", "Tigre", "Papagaio"};
        for(String animal : animais){
            System.out.println(animal);
            if(animal == "Leão") break;
        }
        /*
        os cases seram executados ate o proximo break
         */
    }
}
