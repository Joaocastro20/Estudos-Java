package OracleJava21zo830.Operators;

public class ConditionalOperators {
    public static void main(String[] args) {
        boolean vdd = true, fls = false;
        if(vdd && fls) System.out.println("&&");
        if(vdd || fls) System.out.println("||");
        String s = vdd ? "true" : "false";
        System.out.println(s);
    }
}
