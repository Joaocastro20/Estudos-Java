package OracleJava21zo830.HelloWord;

import OracleJava21zo830.ObjectOriented.Modifieds;

public class HelloWord {
    public static void main(String[] args) {
        System.out.println("Hello Word!");
        System.out.println("tamanho -> "+ args.length);
        for(String arg : args){
            System.out.println("----> "+ arg);
        }
        Modifieds modifieds = new Modifieds();
        modifieds.publico();
    }
}
