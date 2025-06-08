package OracleJava21zo830.ObjectOriented.Nesteds;

public class LocalInner {
    public static void main(String[] args) {
        checkNumber(2);
    }

    public static void checkNumber(int entedNumber){
        int result = 0;

        class NumberCheck {
            boolean isCheck;

            public NumberCheck(int number){
                isCheck = number % 2 == result ? true : false;
            }

            public void printNumber(){
                System.out.println("numero digitado: "+entedNumber);
            }
        }

        NumberCheck numberCheck = new NumberCheck(entedNumber);
        numberCheck.printNumber();
        if(numberCheck.isCheck){
            System.out.println("par");
        }else {
            System.out.println("impar");
        }
    }
}
