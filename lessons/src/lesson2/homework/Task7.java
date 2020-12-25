package lesson2.homework;
// **** Написать метод, которому на вход подается одномерный массив и число n (может быть положительным, или отрицательным), при этом метод должен сместить все элементымассива на n позиций. Для усложнения задачи нельзя пользоваться вспомогательными массивами.
public class Task7 {
    public static void main(String[] args) {
        int[] A = new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9}; // задаём массив
        printIntMas(A);
        Shift(11,A); printIntMas(A);
        Shift(1,A); printIntMas(A);
        Shift(1,A); printIntMas(A);
        Shift(1,A); printIntMas(A);
        Shift(-1,A); printIntMas(A);
        Shift(-1,A); printIntMas(A);
        Shift(-1,A); printIntMas(A);
        Shift(-11,A); printIntMas(A);
    }
// метод Shift c перменными n и массивом a
    private static void Shift(int n, int[] a){
        if (n<0) ShiftLeft(-n,a);
        else ShiftRight(n,a);
    }
    private static void ShiftLeft(int n, int[] a) {
        for (int m = 1; m <= n; m++){
           for (int i = 0; a.length-1 > i; i++) {
               int temp = a[i]; a[i] = a[i+1]; a[i+1] = temp; //меням соседние элементы
              // a[i] = a[i] + a[i+1]; a[i+1] = a[i] - a[i+1]; a[i] = a[i]- a[i+1]; // или меням соседние элементы без доп переменной :)
           }
        }
    }
    private static void ShiftRight(int n, int[] a) {
        for (int m = 1; m <= n; m++){
            for (int i = a.length-1;  i > 0; i--) {
                int temp = a[i-1]; a[i-1] = a[i]; a[i] = temp;
            }
        }
    }
// вспомогательный метод вывода массива чтобы не обращатся к библиотеке
    public static void printIntMas(int[] mas) {
        for (int ma : mas) System.out.printf("%2d ", ma);
        System.out.println();
    }
}
