package OracleJava21zo830.Inheritance.Abstract;

public abstract class Vehicle {
    int vel;

    public Vehicle(){

    }

    public Vehicle(int vel) {
        this.vel = vel;
    }

    abstract int move();

    void ligar(){
        System.out.println("ligou");
    }
}
