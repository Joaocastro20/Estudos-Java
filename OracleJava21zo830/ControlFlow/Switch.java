package OracleJava21zo830.ControlFlow;

import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        System.out.println("Digite o mês: ");
        Scanner input = new Scanner(System.in);
        int mes = input.nextInt();
        String mesExtenso = switch (mes) {
            case 1 -> "Janeiro";
            case 2 -> "Fevereiro";
            case 3 -> "Março";
            case 4 -> "Abril";
            case 5 -> "Maio";
            case 6 -> "Junho";
            case 7 -> "Julho";
            case 8 -> "Agosto";
            case 9 -> "Setembro";
            case 10 -> "Outubro";
            case 11 -> "Novembro";
            case 12 -> "Dezembro";
            default -> "Mês inválido";
        };

        System.out.println(mesExtenso);

        System.out.println("Digite dia da Semana: ");
        int diaSemana = input.nextInt();
        String diaSemanaExtenso = "";

        switch (diaSemana){
            case 1: case 7:
                diaSemanaExtenso = "Fim de semana.";
                break;
            case 2: case 3: case 4: case 5: case 6:
                diaSemanaExtenso = "Meio da semana";
                break;
            default:
                diaSemanaExtenso = "Dia Invalido.";
                break;
        }

        System.out.println(diaSemanaExtenso);
        input.close();
    }
}
