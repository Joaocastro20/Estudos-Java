package OracleJavaAvancado;//Comecei importando a classe Scanner do pacote java.util
import java.util.Scanner;
//Criei uma classe para realizar o código
public class NewClass {
    public static void main(String[] args) {
        boolean loop = true;
        //optei por deixar so um loop no codigo
        while (loop == true){
            //Instanciei o objeto scanner em "inserir"
            Scanner inserir = new Scanner(System.in);

            //Usei dois souts para informar o usuario a entrada dos dados
            System.out.println("Digite o valor de A:");
            int a = inserir.nextInt();
            System.out.println("Digite o valor de B:");
            int b = inserir.nextInt();
            //usei um if para cada situação para ficar mais intuitivo para o usuario
            //uma das restrições imposta no exercicio é B menor que A
            if (b < a){
                System.out.println("o valor A não pode ser maior que o valor B!");
            }
            //outra restrição é B nao pode ultrapassar o valor 10 elevado a 9
            else if (b > 1000000000){
                System.out.println("O valor B não pode ultrapassar 1.000.000.000");
            }
            //não menos importante o valor A nao pode ser menor que 1
            else if(a <= 0){
            System.out.println("O valor A não pode ser menor que 1!");
            }
            else{
                //em uma relação onde A+B+C/3 = A, logo vemos que C = (3*A)-(A+B)
	            int c = ((3*a)-(a+b));
                //A formula realiza a conta e exibe o valor de C
                System.out.println("o valor minimo de C para média e mediana serem a mesma é "+ c);
                //caso os valores digitados pelo usuario satisfaça as restrições o loop termina
                loop = false;
            }
        }
        
    }
}
