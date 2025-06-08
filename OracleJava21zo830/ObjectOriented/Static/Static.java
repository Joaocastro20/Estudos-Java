package OracleJava21zo830.ObjectOriented.Static;
import static OracleJava21zo830.ObjectOriented.Static.Mutiply.*;

public class Static {
    public static void main(String[] args) {
        Mutiply mutiply = new Mutiply();
        System.out.println("Metodo nao estatico ---> " + mutiply.semEstatico(2,2));
        System.out.println("Variavel nao estatica ---> " + mutiply.varNaoEstatica);

        System.out.println("Metodo estatico ---> " + Mutiply.estatico(3,3));
        System.out.println("Variavel estatica ---> " + Mutiply.varEstatica);

        System.out.println("Import Estatico ---> " + estatico(4,4));
        System.out.println(varEstatica);
    }
}
