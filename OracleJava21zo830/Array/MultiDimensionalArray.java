package OracleJava21zo830.Array;

import java.util.Arrays;

public class MultiDimensionalArray {
    public static void main(String[] args) {
        int[][] multi = new int[3][3];
        System.out.println(multi.length);
        multi[0][0] = 1;
        multi[0][1] = 2;
        multi[0][2] = 3;
        multi[1][0] = 4;
        multi[1][1] = 5;
        multi[1][2] = 6;
        multi[2][0] = 7;
        multi[2][1] = 8;
        multi[2][2] = 9;

        for (int i = 0; i < multi.length; i++) {
            for (int j = 0; j < multi[i].length; j++) {
                System.out.print(multi[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("===============================================");

        System.out.println(Arrays.toString(multi[0]));
        System.out.println(Arrays.toString(multi[1]));
        System.out.println(Arrays.toString(multi[2]));

        System.out.println("===============================================");

        int[] idades[] = {
                {1, 23},
                {2 , 45, 70},
                {3}
        };
        System.out.println(Arrays.toString(idades[0]));
        System.out.println(Arrays.toString(idades[1]));
        System.out.println(Arrays.toString(idades[2]));

        System.out.println("===============================================");

        int[][][] _3darray = {
                {
                        {1}
                },
                {
                        {2,3},
                        {4,5,6}
                }
        };
        System.out.println(_3darray[0][0][0]);
        System.out.println(_3darray[1][0][0]);
    }
}
