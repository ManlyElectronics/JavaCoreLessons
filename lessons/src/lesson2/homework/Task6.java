package lesson2.homework;
// Написать метод, в который передается не пустой одномерный целочисленный массив, метод должен вернуть true, если в массиве есть место, в котором сумма левой и правой части массива равны. Примеры: checkBalance([2, 2, 2, 1, 2, 2, || 10, 1]) → true, checkBalance([1, 1, 1, || 2, 1]) → true, граница показана символами ||, эти символы в массив не входят.
public class Task6 {
    public static void main(String[] args){
    int[] A  = new int[] { 12, 1, 12 };
       // System.out.println("length:"+ A.length);
        System.out.println(masSplitTest(A));
    }
        private static boolean masSplitTest(int[] mas){
              for ( int i = 0 ; i< mas.length-1; i++) {
                  // вывод для теста
                  // System.out.printf("Сумма снизу:%d Сумма сверху:%d i:%d сумма массива:%d",masSumB(mas, i), masSumT(mas, i), i, masSumB(mas, i) + masSumT(mas, i) ); System.out.println();
                if (masSumB(mas, i) == masSumT(mas, i)) return true;
              }
              return false;
        }
        // видел можно проще зато по своему
        // сумма от d влево включая d
        private static int masSumB(int[] mas,int d ){
        int sum = 0;
        for (int i = 0; i <= d ;i++) sum = sum + mas[i];
        return sum;
        }
        // сумма от d вправо
        private static int masSumT(int[] mas,int d){
        int sum =0;
        for (int i = d +1 ; i < mas.length ;i++) sum = sum + mas[i];
        return sum;
    }
}