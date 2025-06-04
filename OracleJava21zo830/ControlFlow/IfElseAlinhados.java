package OracleJava21zo830.ControlFlow;

import java.util.Scanner;

public class IfElseAlinhados {
    public static void main(String[] args) {
        System.out.println("Digite sua idade: ");
        Scanner input = new Scanner(System.in);
        int idade = input.nextInt();

        if(idade < 13 ){
            System.out.println("È criança!");
        }else if(idade > 13 && idade < 18 ){
            System.out.println("É adolecente!");
        }else{
            if(idade < 65){
                System.out.println("É adulto!");
            }else{
                System.out.println("É idoso!");
            }
        }
        input.close();
    }
}
