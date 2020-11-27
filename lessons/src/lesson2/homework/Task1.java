package lesson2.homework;
//Задать целочисленный массив, состоящий из элементов 0 и 1. Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ]. С помощью цикла и условия заменить 0 на 1, 1 на 0;
import java.util.Arrays;
public class Task1 {
    public static void main(String[] args){
        int[] mas = new int[] {1,1,0,0,0,1};
        printIntMas(mas);
        mas1and0swap(mas);
        printIntMas(mas);
    }
    private static void mas1and0swap(int[] mas) {
        for (int i = 0; i < mas.length; i++){
            if (mas[i] == 0)  mas[i] =1;
            else mas[i] = 0;
        }
    }
    public static void printIntMas(int[] mas){System.out.println(Arrays.toString(mas));}

}
