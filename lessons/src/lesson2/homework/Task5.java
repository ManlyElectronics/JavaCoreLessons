package lesson2.homework;
//** Задать одномерный массив и найти в нем минимальный и максимальный элементы (без помощи интернета);
public class Task5 {
    public static void main(String[] args){
        int[] A  = new int[] { -13, 5, 3, 2, 11, 4, 5, 2, 40, 8, 9, 1 , 0, 113 }; // задаём массив для теста
        System.out.println("max:"+masMax(A));
        System.out.println("min:"+masMin(A));
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

