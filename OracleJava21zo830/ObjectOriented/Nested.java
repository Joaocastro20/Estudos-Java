package OracleJava21zo830.ObjectOriented;

public class Nested {
    public static void main(String[] args) {
        System.out.println(NestedALinhada.isCheck);
        NestedALinhada.show();
    }

     static class NestedALinhada {
        static boolean isCheck;

        static void show(){
            System.out.println("SHOW");
        }
    }
}
