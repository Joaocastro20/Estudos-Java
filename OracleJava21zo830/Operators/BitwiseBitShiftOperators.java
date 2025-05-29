package OracleJava21zo830.Operators;

public class BitwiseBitShiftOperators {
    private static int x = 60;
    private static int y = 13;
    public static void main(String[] args) {
        System.out.println(Integer.toBinaryString(x));
        System.out.println(Integer.toBinaryString(y));
        System.out.println(Integer.toBinaryString(x & y));
        System.out.printf("Resultado: %d\n", x & y);
        System.out.println("--------------------------------------------------");

        System.out.println(Integer.toBinaryString(x));
        System.out.println(Integer.toBinaryString(y));
        System.out.println(Integer.toBinaryString(x | y));
        System.out.printf("Resultado: %d\n", x | y);
        System.out.println("--------------------------------------------------");

        System.out.println(Integer.toBinaryString(x));
        System.out.println(Integer.toBinaryString(x << 2 ));
        System.out.printf("Resultado: %d\n", x << 2);
        System.out.println("--------------------------------------------------");

        System.out.println(Integer.toBinaryString(x));
        System.out.println(Integer.toBinaryString(x >> 2 ));
        System.out.printf("Resultado: %d\n", x >> 2);
        System.out.println("--------------------------------------------------");

        System.out.println(Integer.toBinaryString(x));
        System.out.println(Integer.toBinaryString(y));
        System.out.println(Integer.toBinaryString(x ^ y));
        System.out.printf("Resultado: %d\n", x ^ y);
        System.out.println("--------------------------------------------------");

        System.out.println(Integer.toBinaryString(x));
        System.out.println(Integer.toBinaryString(~x));
        System.out.printf("Resultado: %d\n", ~x);
        System.out.println("--------------------------------------------------");
    }
}
