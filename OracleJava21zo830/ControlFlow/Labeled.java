package OracleJava21zo830.ControlFlow;

public class Labeled {
    public static void main(String[] args) {
//        externo:for(int i = 1; i <= 3;i++){
//            interno:for(int j = 1; j <= 3; j++){
//                System.out.println("externo " + i + " interno " + j);
//                if(i == 2 && j == 2) break interno;
//            }
//        }
        int count = 0;
        outer:
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.println(i+j);
                if (i + j > 5) break outer;
                count++;
            }
        }
        System.out.println("Count: " + count);
    }
}
