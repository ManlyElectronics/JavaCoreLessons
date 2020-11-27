package lesson2.homework;
// TO DO ALL
// 26Nov
// **** Написать метод, которому на вход подается одномерный массив и число n (может быть положительным, или отрицательным), при этом метод должен сместить все элементымассива на n позиций. Для усложнения задачи нельзя пользоваться вспомогательными массивами.

public class Task7 {
    public static void main(String[] args) {
        int n = -9;
        n= Math.abs(n);
        int[] A = new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9}; // задаётся массив
        printIntMas(A);
        Shift(n, A); // массив A смещается на n
        printIntMas(A);
    }
// метод Shift c перменными n и массивом A путём перебора солседних элементов
    private static void Shift(int n, int[] a) {
        for (int m = 1; m <= n; m++){
           for (int i = 0; a.length-1 > i; i++) {
               int temp = a[i]; a[i] = a[i+1]; a[i+1] = temp;
        }
        }
    }


    public static void printIntMas(int[] mas) {
        for (int i = 0; mas.length > i; i++) {
            System.out.printf("%2d ", mas[i]);
        }
        System.out.println();

    }
}
