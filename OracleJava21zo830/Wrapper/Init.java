package OracleJava21zo830.Wrapper;

import java.util.ArrayList;
import java.util.List;

public class Init {


    public static void main(String[] args) {
//        Generics: Ao usar generics, você precisa especificar tipos de objetos, não tipos primitivos.
//        Por exemplo, List<Integer> é válido, mas List<int> não é.
//        List<int> listprim = new ArrayList<>();
        List<Integer> listInt = new ArrayList<>();

//        Recursos orientados a objetos: Classes wrapper permitem que você aplique conceitos
//        de orientação a objetos aos tipos primitivos, como chamar métodos em seus valores
//        (por exemplo, Integer.parseInt("123")).
        System.out.println(Integer.parseInt("2"));

//        Nullability: Tipos primitivos não podem ser null. As classes wrapper,
//        sendo objetos, podem ser null, o que pode ser útil para representar a ausência de um valor.
//        int a = null;
        Integer y = null;

        //Autoboxing
        int a = 10;
        Integer b = a; // Autoboxing: int a é convertido para Integer b

        //Inbox
        Integer c = 20;
        int d = c; // Unboxing: Integer c é convertido para int d

//        Esses recursos tornam o código mais conciso e legível, eliminando a necessidade
//        de conversões manuais explícitas entre primitivos e seus wrappers.

//        Tipo Primitivo	Classe Wrapper
//        byte	Byte
//        short	Short
//        int	Integer
//        long	Long
//        float	Float
//        double	Double
//        char	Character
//        boolean	Boolean

        Integer h = 3;
        System.out.println(h.intValue());
        System.out.println(h + 3);
    }
}
