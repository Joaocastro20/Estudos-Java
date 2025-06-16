package OracleJava21zo830.Inheritance.Abstract;

public class Car extends Vehicle{

    @Override
    int move() {
        return 380;
    }

    @Override
    void ligar() {
        super.ligar();
    }
}
