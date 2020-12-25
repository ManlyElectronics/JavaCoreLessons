package lesson2.homework;
//Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое), и с помощью цикла(-ов) заполнить его диагональные элементы единицами;
public class Task4 {
    public static void main(String[] args){
        final int size = 5;
        int[][] A = new int[size][size];
        masFillDiag(A);
        printIntMas(A);
    }
    private static void masFillDiag(int[][] mas) {
        for (int i = 0; mas.length > i; i++) {
            mas[i][i] =1; // по главной диаганали
            mas[i][mas.length-1-i]=1; // по побочной диагонали
        }
    }

    // распечатывеет массив без билиотеки
    public static void printIntMas(int[][] mas){
            for (int i = 0; mas.length > i; i++){
                for (int j=0; j <mas.length; j++) System.out.printf("%2d ", mas[i][j]);
                System.out.println();
            }
        }
}
