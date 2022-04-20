package com.company;

public class ExerciciosII {
    //funçao mostrar dia mes em palavras e ano de uma data
    public static void main(String[] args) {
        data_certa(1,2,2000);
    }
    static void data_certa(int a,int b,int c){
        String mes = "";
        switch (b){
            case 1:
                mes = "janeiro";
                break;
            case 2:
                mes = "fevereiro";
                break;
            case 3:
                mes = "março";
                break;
            case 4:
                mes = "abril";
                break;
            case 5:
                mes = "maio";
                break;
            case 6:
                mes = "junho";
                break;
            case 7:
                mes = "julho";
                break;
            case 8:
                mes = "agosto";
                break;
            case 9:
                mes = "setembro";
                break;
            case 10:
                mes = "outubro";
                break;
            case 11:
                mes = "novembro";
                break;
            default:
                mes = "dezembro";
        }
        System.out.println(a);
        System.out.println(mes);
        System.out.println(c);
    }
}
