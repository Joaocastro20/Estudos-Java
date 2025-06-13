package OracleJava21zo830.Inheritance.SuperAndThis;

public class ThisKeyWord {

    String car;
    int year;

    public ThisKeyWord(String car, int year) {
        this.car = car;
        year = year;
    }

    public static void main(String[] args) {
        ThisKeyWord thisKeyWord = new ThisKeyWord("Fusca", 1988);
        System.out.println("Car: " + thisKeyWord.car);
        System.out.println("Year: " + thisKeyWord.year);
    }
}
