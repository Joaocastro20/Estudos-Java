package OracleJava21zo830.Array;

import java.sql.Array;
import java.util.Arrays;

public class InitArray {
    public static void main(String[] args) {
//        int[] list;
//        list = new int[5];
//        list[2] = 1;
//        list[4] = 2;
//        for(int i : list){
//            System.out.println(i);
//        }

        int[] list2 = {5, 6, -1, 3, 10};
        list2[3] = 1;
        for( int i : list2){
            System.out.println(i);
        }
        System.out.println(Arrays.toString(list2));

        Object[] listMixed = {3, 2.5, "aaa", 'a'};
        System.out.println(Arrays.toString(listMixed));
    }
}
