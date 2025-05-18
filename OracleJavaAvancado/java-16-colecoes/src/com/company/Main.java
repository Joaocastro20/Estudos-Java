import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ArrayList<Integer> lista = new ArrayList<Integer>();
        Scanner teclado = new Scanner(System.in);
        int o = 0;
        while ( o == 0){
            System.out.println("digite um numero:");
            lista.add(teclado.nextInt());
            System.out.println("deseja continuar?[S/N]:");
            o = teclado.nextInt();
        }
        Collections.sort(lista);

        for(Object list : lista){
            System.out.println(list);
        }
        System.out.println("sua lista tem "+lista.size()+" itens");
    }
}
