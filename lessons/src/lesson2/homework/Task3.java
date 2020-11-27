package lesson2.homework;
// Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом, и числа меньшие 6 умножить на 2;
import java.util.Arrays;
public class Task3 {
    public static void main(String[] args){
        int[] A  = new int[] { 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 };
        printIntMas(A);
        A = masSDouble(A);
        printIntMas(A);
    }
    private static int[] masSDouble(int[] mas) {
        for (int i: mas)  if (mas[i] < 6) mas[i] = mas[i]* 2;
        return mas;
    }
    public static void printIntMas(int[] mas){System.out.println(Arrays.toString(mas));}
}
