import java.util.Scanner;

public class Main {
    static String frutas[];
    static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {
        int qtd;
        System.out.println("Informe a quantidade de frutas que deseja cadastrar:");
        qtd = Integer.parseInt(teclado.nextLine());
        cadastrar_dados(qtd);
        mostrar_dados(qtd);
    }
    static void  cadastrar_dados(int quantidade) {
        frutas = new String[quantidade];
        for (int i = 0; i < quantidade; i++) {
            System.out.println("informe a " + (i + 1) + " fruta:");
            frutas[i] = teclado.nextLine();
        }
        System.out.println("voce cadastrou:");
    }

    static void mostrar_dados(int quantidade){
        for(int i = 0;i< quantidade;i++){
            System.out.println((i+1)+"--------->"  +frutas[i]);
        }
    }
}
