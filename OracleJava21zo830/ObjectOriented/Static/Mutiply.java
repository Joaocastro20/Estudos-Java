package OracleJava21zo830.ObjectOriented.Static;

public class Mutiply {

    static int varEstatica = 0;
    int varNaoEstatica = 1;

    /**
     * metodo nao estatico, presisa instaciar o objeto pra usar
     * @param x
     * @param y
     * @return
     */
    public int semEstatico(int x, int y){
        return x * y;
    }

    /**
     * metodo estatico, nao necessita de instaciar pra usar
     * @param x
     * @param y
     * @return
     */
    public static int estatico(int x, int y){
        return x * y;
    }
}
