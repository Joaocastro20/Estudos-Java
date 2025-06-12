package OracleJava21zo830.Inheritance;

public class TestInheritance {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.breath("Dog");
        dog.legs = 4;
        dog.showLegs();

        Bird bird = new Bird();
        bird.fly();
        bird.showLegs();
    }
}
