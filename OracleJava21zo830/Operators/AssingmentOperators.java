package OracleJava21zo830.Operators;

import java.util.Scanner;

public class AssingmentOperators {
    public static void main(String[] args) {
        float a , r = 0;
        Scanner input = new Scanner(System.in);
        a = input.nextFloat();

        r += a;
        System.out.println("+=" + r);

        r *= a;
        System.out.println("*= " + r);

        r /= a;
        System.out.println("/= " + r);

        r %= a;
        System.out.println("%= " + r);

        r -= a;
        System.out.println("-= " + r);

    }
}
