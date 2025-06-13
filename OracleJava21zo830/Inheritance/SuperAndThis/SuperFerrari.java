package OracleJava21zo830.Inheritance.SuperAndThis;

public class SuperFerrari extends SuperCar{
    boolean isAutom = true;

    public void printer(){
        System.out.println(isAutom);
        System.out.println(super.isAutom);
        super.show();
    }

    protected void show(){
        System.out.println("Show Ferrari");
    }

    void display(){
        show();
        this.show();
        super.show();
    }

    public static void main(String[] args) {
        SuperFerrari superFerrari = new SuperFerrari();
        superFerrari.display();
    }
}
