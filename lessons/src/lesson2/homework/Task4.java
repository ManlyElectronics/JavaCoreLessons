package lesson2.homework;
public class Task4 {
    public static void main(String[] args){
        final int size = 5;
        int[][] A = new int[size][size];
        masFillDiag(A);
        //System.out.print(Arrays.deepToString(A));
        printIntMas(A);
    }
    private static int[][] masFillDiag(int[][] mas) {
        for (int i = 0; mas.length > i; i++) {mas[i][i] =1;mas[i][mas.length-1-i]=1;}
        return mas;
    }
    public static void printIntMas(int[][] mas){
            for (int i = 0; mas.length > i; i++){
                for (int j=0; j <mas.length; j++) System.out.printf("%2d ", mas[i][j]);
                System.out.println();
            }
        }
}
