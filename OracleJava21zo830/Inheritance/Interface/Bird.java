package OracleJava21zo830.Inheritance.Interface;

public class Bird implements CanFed, CanFly{

    @Override
    public void canEat() {
        System.out.println("Can eat!");
    }

    @Override
    public void canDrink() {
        System.out.println("Can drink!");
    }

    @Override
    public void canFly() {
        System.out.println("Can fly!");
    }
}
