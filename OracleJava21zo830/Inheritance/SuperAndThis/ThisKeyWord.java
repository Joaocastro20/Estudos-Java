package OracleJava21zo830.Inheritance.SuperAndThis;

public class ThisKeyWord {

    String car;
    int year;

    public ThisKeyWord(){
        this("Palio", 1978);
    }

    public ThisKeyWord(String car, int ano) {
        this.car = car;
        year = ano;
    }

    public static void main(String[] args) {
        ThisKeyWord thisKeyWord = new ThisKeyWord();
        System.out.println("Car: " + thisKeyWord.car);
        System.out.println("Year: " + thisKeyWord.year);
    }
}
