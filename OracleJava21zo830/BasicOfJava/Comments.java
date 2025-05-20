package OracleJava21zo830.BasicOfJava;

public class Comments {
    /**
     *
     * Este é o main da classe
     * @param args
     *
     * */
    public static void main(String[] args) {
        //SIMPLES
        System.out.println("1");
        /* Multiplas */
        System.out.println("2");
        //DOCUMENTACAO
        /** DOCUMENTAR*/
        System.out.println("3");

        System.out.println( "Multi -> " + mutiplicar(2, 2));
    }

    /**
     *  Este metodo mutiplica dois inteiros
     * @param x primeiro valor
     * @param y segundo valor
     * @return retorna o produto.
     */
    public static int mutiplicar(int x, int y){
        return x * y;
    }
}
