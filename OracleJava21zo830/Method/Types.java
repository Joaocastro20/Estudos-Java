package OracleJava21zo830.Method;

import java.util.ArrayList;

public class Types {
    public static void main(String[] args) {
        String[] nomes = {"jao", "maria", "jose"};
        show(nomes);
    }

    static void show(String... lista){
        for(String a : lista){
            System.out.println(a);
        }
    }
}
