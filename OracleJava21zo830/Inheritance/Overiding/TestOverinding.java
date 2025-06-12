package OracleJava21zo830.Inheritance.Overiding;

public class TestOverinding {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        vehicle.start();
        vehicle.acellerate(60);
        vehicle.stop();

        System.out.println("=============================================");

        Car car = new Car();
        car.start();
        car.acellerate(50);
        car.stop();
    }
}
