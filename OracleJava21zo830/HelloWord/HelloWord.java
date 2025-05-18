package OracleJava21zo830.HelloWord;

public class HelloWord {
    public static void main(String[] args) {
        System.out.println("Hello Word!");
        System.out.println("tamanho -> "+ args.length);
        for(String arg : args){
            System.out.println("----> "+ arg);
        }
    }
}
