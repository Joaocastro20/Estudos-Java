import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Scanner;

public class LeituraEscrita {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        try {
            PrintStream escrever = new PrintStream("saida.txt");
            System.out.println("escreva algo para ser salvo");
            String msg = teclado.nextLine();
            escrever.println(msg);
            teclado.close();

        }catch (FileNotFoundException e){
            System.out.println("nao foi posivel escrever o arquivo");
        }


    }
}
