package lesson2.homework;
// TO DO ALL
// 26Nov
// **** Написать метод, которому на вход подается одномерный массив и число n (может быть положительным, или отрицательным), при этом метод должен сместить все элементымассива на n позиций. Для усложнения задачи нельзя пользоваться вспомогательными массивами.
public class Task7VNGood {
    public static void main(String[] args){
        int n = 3;
    int[] A  = new int[] {0, 1, 2, 3, 4,5,6,7,8,9};
       System.out.println("length:"+ A.length);
       printIntMas(A);
        for (int i = 0; A.length > i; i++) {
        int iNew = i + n;
        if (iNew >= A.length) iNew = i - A.length +n;
        A[i]= A[iNew];
        }
        printIntMas(A);
    }

    public static void printIntMas(int[] mas){
        for (int i = 0; mas.length > i; i++){
            System.out.printf("%2d ", mas[i]);
        }
        System.out.println();
    }
    }
