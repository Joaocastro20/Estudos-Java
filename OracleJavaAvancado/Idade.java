package OracleJavaAvancado;

import java.util.*;

public class Idade {
    public static void main(String[] args) {
        Scanner inserir = new Scanner(System.in);
        int a = inserir.nextInt();
        int b = inserir.nextInt();
        int c = inserir.nextInt();
        List<Integer> lista = new ArrayList<>();
        lista.add(a);
        lista.add(b);
        lista.add(c);
        Collections.sort(lista);
		System.out.println(lista.get(1));
}
}