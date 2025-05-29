package OracleJava21zo830.Operators;

public class CharDataType {
    public static void main(String[] args) {
        char a = 72;
        char b = 53;
        System.out.println((int) a);
        System.out.println("É uma letra: " + Character.isLetter(a));
        System.out.println("É uma Digito: " + Character.isDefined(a));

        System.out.println((int) b);
        System.out.println("É uma letra: " + Character.isLetter(b));
        System.out.println("É uma Digito: " + Character.isDefined(b));;

        char letter1 = 67;
        int num1 = letter1 + 3;
        char letter2 = (char) num1;
        System.out.println("letter2 : " + letter2);
    }
}
