package lesson2.homework;
import java.util.Arrays;

public class Task2 {
    public static void main(String[] args){
        final int size = 8;
        int[] A = new int[size];
        printIntMas(A);
        A = masFillin(A, size);
        printIntMas(A);
    }
    private static int[] masFillin(int[] mas, int size) {
        for (int i = 0; i < size; i++) mas[i] = i * 3;
        return mas;
    }
    public static void printIntMas(int[] mas){System.out.println(Arrays.toString(mas));}
}
