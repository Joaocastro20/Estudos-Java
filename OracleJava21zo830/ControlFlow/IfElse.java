package OracleJava21zo830.ControlFlow;

import java.util.Scanner;

public class IfElse {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int cond = input.nextInt();
        if(cond % 2 == 0){
            System.out.println("Par!");
        }else{
            System.out.println("Impar!");
        }
        input.close();

    }
}
