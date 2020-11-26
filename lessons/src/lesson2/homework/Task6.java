package lesson2.homework;
// TO DO
// сумма снизу Sb неправильно
// Написать метод, в который передается не пустой одномерный целочисленный массив, метод должен вернуть true, если в массиве есть место, в котором сумма левой и правой части массива равны. Примеры: checkBalance([2, 2, 2, 1, 2, 2, || 10, 1]) → true, checkBalance([1, 1, 1, || 2, 1]) → true, граница показана символами ||, эти символы в массив не входят.
public class Task6 {
    public static void main(String[] args){
    int[] A  = new int[] { 2, 2, 1, 1,3 ,0,1};
    // для теста  printIntMas(A);
    System.out.println(masSplitTest(A));  }
        private static boolean masSplitTest(int[] mas){
              for ( int i = 0 ; i< mas.length-1; i++) {
                // для теста System.out.printf("Сумма снизу:%d Сумма сверху:%d i:%d сумма массива:%d ДлиннаМассива:%d",Sb, St, i, Sb+St, mas.length );System.out.println();
                if (masSumB(mas, i) == masSumT(mas, i)); return true;
              }
              return false;
        }
        private static int masSumB(int[] mas,int d ){
        int sum = 0;
        for (int i = 0; i <= d ;i++) sum = sum + mas[i];
        return sum;
        }
    private static int masSumT(int[] mas,int d){
        int l = mas.length;
        int sum =0;
        for (int i = d +1 ; i < l ;i++) sum = sum + mas[i];
        return sum;
    }
    public static void printIntMas(int[] mas){
        for (int i = 0; mas.length > i; i++) System.out.printf("%2d ", mas[i]);
        System.out.println();
    }
}