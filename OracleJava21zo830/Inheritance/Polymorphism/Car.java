package OracleJava21zo830.Inheritance.Polymorphism;

public class Car extends Vehicle{
//    Chamado de polimorfismo dinâmico, acontece quando uma subclasse fornece sua própria implementação de um método já definido na superclasse.
    public void accelerate(){
        System.out.println("Car is acellerating!");
    }
}
