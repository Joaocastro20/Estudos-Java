package OracleJava21zo830.Inheritance.Interface;

public class Test {
    public static void main(String[] args) {
        Bird bird = new Bird();
        bird.canEat();
        bird.canDrink();
        bird.canFly();

        People people = new People();
        people.canEat();
        people.canDrink();

        Eagles eagles = new Eagles();
        eagles.canFly();
    }
}
