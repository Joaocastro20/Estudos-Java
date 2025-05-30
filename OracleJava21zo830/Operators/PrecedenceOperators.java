package OracleJava21zo830.Operators;

public class PrecedenceOperators {
    public static void main(String[] args) {
        int result = 0;
        System.out.println(result);
        result += 80 / 20 % 8 * 3 + -5;
        System.out.println(result);

        int x = 8, y = 4, z = 2, sum = 0;
        sum = x + --y + --z; //8 + 3 + 1
        System.out.println("soma: " + sum);

        int sum2 = 0;
        sum2 = x + y-- + --z + y; // 8 + 4 + 1 + 4 =
        System.out.println("soma2: " + sum2);

        //a execucao binaria acima interfere nos resultados

    }
}
