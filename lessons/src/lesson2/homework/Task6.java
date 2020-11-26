package lesson2.homework;
// 26Nov
// Написать метод, в который передается не пустой одномерный целочисленный массив, метод должен вернуть true, если в массиве есть место, в котором сумма левой и правой части массива равны. Примеры: checkBalance([2, 2, 2, 1, 2, 2, || 10, 1]) → true, checkBalance([1, 1, 1, || 2, 1]) → true, граница показана символами ||, эти символы в массив не входят.
public class Task6 {
    public static void main(String[] args){
    int[] A  = new int[] { 12, 2, 1, 1,1,1,2,6,6};
       // System.out.println("length:"+ A.length);
        System.out.println(masSplitTest(A));

    }
        private static boolean masSplitTest(int[] mas){
              for ( int i = 0 ; i< mas.length-1; i++) {
               // System.out.printf("Сумма снизу:%d Сумма сверху:%d i:%d сумма массива:%d",masSumB(mas, i), masSumT(mas, i), i, masSumB(mas, i) + masSumT(mas, i) ); System.out.println();
                if (masSumB(mas, i) == masSumT(mas, i)) return true;
              }
              return false;
        }
        private static int masSumB(int[] mas,int d ){
        int sum = 0;
        for (int i = 0; i <= d ;i++) sum = sum + mas[i];
        return sum;
        }
        private static int masSumT(int[] mas,int d){
        int sum =0;
        for (int i = d +1 ; i < mas.length ;i++) sum = sum + mas[i];
        return sum;
    }
}