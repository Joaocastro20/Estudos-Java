package OracleJava21zo830.Inheritance.Record;

 public record Person() implements Drink{
     static int age;

     @Override
     public void canDrink(String name) {
         System.out.println("Can Drink! " + name);
     }
 }
