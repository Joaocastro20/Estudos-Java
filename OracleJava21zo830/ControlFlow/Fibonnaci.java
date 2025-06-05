package OracleJava21zo830.ControlFlow;

public class Fibonnaci {
    public static void main(String[] args) {
        int max = 5, sum = 0, anterior = 0, fibanacci = 1;
        for( int i = 0; i <= max;i++){
            System.out.println(anterior);
            sum = anterior + fibanacci;
            anterior = fibanacci;
            fibanacci = sum;

        }
    }
}
