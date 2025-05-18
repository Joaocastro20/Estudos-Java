import java.util.Scanner;

public class Main {

    static Scanner teclado = new Scanner(System.in);
    static int  pontos = 0;
    static Calcular calc;

    public static void main(String[] args) {
        Main.jogar();
    }

    private static void jogar() {
        System.out.println("Informe a difilculdade desejada [1,2,3 ou 4]");
        int difilculdade = Main.teclado.nextInt();
        Main.calc = new Calcular(difilculdade);

        System.out.println("Informe o reultado para a seguinte operaçao");

        if(calc.getOperacao()==0){
            System.out.println(calc.getValor1()+"+"+ calc.getValor2());
            int resposta = Main.teclado.nextInt();

            if(calc.somar(resposta)){
                Main.pontos += 1;
                System.out.println("voce tem "+Main.pontos+" pontos");
            }
        }

        if(calc.getOperacao()==1){
            System.out.println(calc.getValor1()+"-"+ calc.getValor2());
            int resposta = Main.teclado.nextInt();

            if(calc.diminuir(resposta)){
                Main.pontos +=1;
                System.out.println("voce tem "+Main.pontos+" pontos");
            }
        }
        if(calc.getOperacao()==2){
            System.out.println(calc.getValor1()+"x"+ calc.getValor2());
            int resposta = Main.teclado.nextInt();

            if(calc.multiplicar(resposta)){
                Main.pontos +=1;
                System.out.println("voce tem "+Main.pontos+" pontos");
            }
        }
        System.out.println("Deseja continuar");
        boolean op = true;
        op = teclado.nextBoolean();
        if(op ==true){
            Main.jogar();
        }else{
            System.out.println("ate a proxima voce feiz "+Main.pontos+" pontos");
        }
    }
}
