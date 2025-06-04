package OracleJava21zo830.ControlFlow;

public class Loop {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            if (i % 7 == 0) {
                sum += i;
                System.out.println(i);
            }

        }
        System.out.println("Soma dos mutiplos de 7: " + sum);
    }
}
