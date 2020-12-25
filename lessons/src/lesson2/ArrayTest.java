package lesson2;

import java.util.Arrays;

public class ArrayTest {

    public static void main(String[] args) {

        final int SIZE = 5;

        int[] data = new int[SIZE];
//        int[] data = {1, 2, 3, 4, 5, 6, 7};

        Arrays.fill(data, 1);
        data[0] = 5;
        data[4] = 3;
//        data[6] = 1;
//        data[-1] = 1;

        Arrays.sort(data);
//        System.out.println(Arrays.toString(data));

/*        for (int i = 0; i < data.length; i++) {
            System.out.printf("Index %d: %d%n", i, data[i] );
        }*/

        int[][] deepArray = new int[SIZE][SIZE];

        int n = 1;
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j <SIZE; j++) {
                deepArray[i][j] = n++;
            }
        }

/*        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                System.out.printf("%2d ", deepArray[i][j]);
            }
            System.out.println();
        }*/

        /*for (int[] ints : deepArray) {
            for (int anInt : ints) {
                System.out.printf("%2d ", anInt);
            }
            System.out.println();
        }

        String str = "Hello world";
        for (char c : str.toCharArray()) {
            System.out.println(c);
        }*/


        for (int i = 0; i < 30; i++) {
            System.out.printf("%d: %c\t", i, i);
            if (i % 15 == 0) {
                System.out.println();
            }
        }

    }
}
