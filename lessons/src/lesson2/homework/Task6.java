package lesson2.homework;

import java.util.Arrays;

public class Task6 {
    public static void main(String[] args){
                    int[] A  = new int[] { -221, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 , 0, 113 };
        System.out.println(Arrays.toString(A));

        }
        private static int masMax(int[] mas) {
        int max = mas[0] ;
            for (int i = 1 ; i< mas.length; i++) if (mas[i] > max) max = mas[i];
            return max;
        }
        private static int masMin(int[] mas){
            int min = mas[0];
            for (int i = 1 ; i< mas.length; i++) if (mas[i] < min) min = mas[i];
            return min;
        }
}
