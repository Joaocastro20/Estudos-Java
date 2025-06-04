package OracleJava21zo830.ControlFlow;

public class ForEach {
    public static void main(String[] args) {
        int[] numeros = {1,2,3,4,5,6,7,8};
        for(int numero : numeros){
            System.out.println(numero);
        }
        String nome = "Joao Pedro";
        for (char letra : nome.toCharArray()){
            System.out.println(letra);
        }
    }
}
