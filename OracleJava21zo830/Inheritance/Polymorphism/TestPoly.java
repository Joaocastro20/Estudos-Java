package OracleJava21zo830.Inheritance.Polymorphism;

public class TestPoly {
    public static void main(String[] args) {
        Vehicle vehicle = new Car();
        vehicle.accelerate();

        if(vehicle instanceof Car){
            Car car1 = (Car) vehicle;
        }

        Vehicle vehicle1 = new Motorcycle();
        vehicle1.accelerate();

//        Car car = (Car) new Vehicle();
        System.out.println(somar(1, 1));
        System.out.println(somar(2.5, 3.5));
    }

//    Chamado também de polimorfismo estático, acontece quando métodos com o mesmo nome têm parâmetros diferentes dentro da mesma classe.
    public static int somar(int a, int b) {
        return a + b;
    }

    public static double somar(double a, double b) {
        return a + b;
    }

}
