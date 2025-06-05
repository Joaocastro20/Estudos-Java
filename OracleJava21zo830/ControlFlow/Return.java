package OracleJava21zo830.ControlFlow;

import java.util.Arrays;
import java.util.List;

public class Return {
    public static void main(String[] args) {
//        int a = 2;
//        switch (a){
//            case 1:
//                System.out.println("a");
//                break;
//            case 2:
//                System.out.println("b");
//                return;
//        }
//        System.out.println("out");
        boolean isCheck = true;
        if(isCheck) return;
        List<String> carros = Arrays.asList(
                "Gol",
                "Onix",
                "Civic",
                "Corolla",
                "Uno",
                "Palio",
                "HB20",
                "Fiesta",
                "Cruze",
                "Toro",
                "Compass",
                "Renegade",
                "Ka",
                "Fox",
                "Siena",
                "Saveiro",
                "Strada",
                "Argo",
                "Mobi",
                "T-Cross"
        );
        for(String car : carros){
            if(car == "Mobi") return;
            System.out.println(car);
        }
    }
}
