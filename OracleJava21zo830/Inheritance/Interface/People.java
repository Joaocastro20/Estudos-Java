package OracleJava21zo830.Inheritance.Interface;

public class People implements CanFed{

    @Override
    public void canEat() {
        System.out.println("People can eat!");
    }

    @Override
    public void canDrink() {
        System.out.println("People can drink!");
    }
}
