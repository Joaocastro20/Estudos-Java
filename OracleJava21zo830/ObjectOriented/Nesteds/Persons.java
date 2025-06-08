package OracleJava21zo830.ObjectOriented.Nesteds;

public class Persons {
    static String person1 = "Jao";
    private static String person2 = "Tiao";
    public String person3 = "Sebastiao";

    static class EstaticaPerson{
        void show(){
            System.out.println(person1);
            System.out.println(person2);
            System.out.println();
        }
    }

}
