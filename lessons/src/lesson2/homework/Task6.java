package lesson2.homework;
// TO DO
// сумма снизу Sb неправильно
// Написать метод, в который передается не пустой одномерный целочисленный массив, метод должен вернуть true, если в массиве есть место, в котором сумма левой и правой части массива равны. Примеры: checkBalance([2, 2, 2, 1, 2, 2, || 10, 1]) → true, checkBalance([1, 1, 1, || 2, 1]) → true, граница показана символами ||, эти символы в массив не входят.


import java.util.Arrays;

public class Task6 {
    public static void main(String[] args){
                    int[] A  = new int[] { 3, 2, 4 ,1};
        System.out.println(Arrays.toString(A));
        // System.out.println(s);

System.out.println(masSplitTest(A));
        }

        private static boolean masSplitTest(int[] mas){
              for ( int i = 0 ; i< mas.length-1; i++) {
                int Sb = masSumB(mas, i);
                int St = masSumT(mas, i);
                System.out.printf("Сумма снизу:%d Сумма сверху:%d i:%d сумма массива:%d ДлиннаМассива:%d",Sb, St, i, Sb+St, mas.length );
                  System.out.println();

                if (Sb == St) return true;
               // System.out.println(Dev);

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
        for (int i = l-1; i >d;i--) sum = sum + mas[l-1-i];
        return sum;
    }


}
