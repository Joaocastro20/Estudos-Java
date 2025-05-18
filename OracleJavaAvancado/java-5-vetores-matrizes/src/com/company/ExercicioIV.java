import java.util.Random;

public class ExercicioIV {
    public static void main(String[] args) {
        //lista com a soma de indices aleatorios
        int lista[] = {2,8,6,5,4,22,33,49};
        Random gerador = new Random();
        int x = gerador.nextInt(8);
        int y = gerador.nextInt(8);
        int r = lista[x] + lista[y];
        System.out.println("as posiçoes "+x+" mais "+y+" é:");
        System.out.println(r);


    }
}
