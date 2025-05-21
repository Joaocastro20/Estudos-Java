package OracleJava21zo830.BasicOfJava;

public class DataTypes {
    public static void main(String[] args) {
        //PRIMITIVOS
        boolean btrue = true, bfalse = false;
        char ca = 'A', cb = 'B';
        int imin = -2147483648, imax = 2147483647, iValorPadrao = 0;
        byte bmin = -128, bmax = 127, bValorPadrao = 0;
        short smin = -32768, smax = 32767, sValorPadrao = 0;
        long lmin = 9223L, lmax = 4342 ;
        float f = 9878.8787F;
        double d = 87878.9898;
        long money = 1_000_000_000L;
        float sobra = 87.877_898F;
        //NAO PRIMITIVOS
        /*
        Class
        Enum
        Interface
        String
        Array
         */
        System.out.println("boolean sao " + btrue + " e " + bfalse);
        System.out.println("exemplo de char " + ca + " e " + cb);
        System.out.printf("exemplo de int %d e %d valor padrao: %d%n", imin, imax, iValorPadrao);
        System.out.printf("exemplo de byte %d e %d valor padrao: %d%n", bmin, bmax, bValorPadrao);
        System.out.printf("exemplo de short %d e %d valor padrao: %d%n", smin, smax, sValorPadrao);
        System.out.println("exemplo de float " + f);
        System.out.println("exemplo de double " + d);
        System.out.println("exemplo de long " + lmin + " e " + lmax);
        System.out.println("money " + money + sobra);
    }
}
