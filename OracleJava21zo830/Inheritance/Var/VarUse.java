package OracleJava21zo830.Inheritance.Var;

import java.util.ArrayList;
import java.util.Arrays;

public class VarUse {

    public static void main(String[] args) {
        VarUse varUse = new VarUse();
        varUse.testeVar();
    }

    void testeVar() {
        var nome = "Jao";
        var lista = new int[5];
        System.out.println(nome);
        for (var item : lista) {
            System.out.println(item);
        }

        for (var i = 0; i < 10; i++) {
            System.out.print(i);
        }

    }
}
