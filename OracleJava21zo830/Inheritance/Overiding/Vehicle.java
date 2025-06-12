package OracleJava21zo830.Inheritance.Overiding;

public class Vehicle {

    void start(){
        System.out.println("Start");
    }

    public void acellerate(int speed){
        System.out.printf("speed: %d%n", speed);
    }

    public void stop(){
        System.out.println("Stop");
    }
}
