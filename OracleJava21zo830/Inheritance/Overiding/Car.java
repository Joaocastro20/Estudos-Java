package OracleJava21zo830.Inheritance.Overiding;

public class Car extends Vehicle{
    void start(){
        System.out.println("Start Car");
    }

    public void acellerate(int speed){
        System.out.printf("speed car: %d%n", speed);
    }

    public void stop(){
        System.out.println("Stop Car");
    }

}
