// 23Nov HomeWorkV2
package lesson1.homework;

public class Tasks1_8 {
    public static void main(String[] args){
        // Примитивные переменные
        // Целочисленные: byte (-127..128 = 257+0 ??? ), short (2^16 = -32k..+32k), int (-10^9 , long
        // С плавающей запятой: float, double
        // Символьные: char, string
        // Лоингческие: boolean
        int charNumber = 'А';
        String strA = "Привет.\n Вот переменные различных типов";
        char charA = (char) charNumber;
        byte byteA = 127;
        short shortA = 32767;
        int a = 2147483647;
        long b = 127L;
        float c = 127f;
        double d = 127;
        boolean booleanA = true;
        System.out.println(strA + "\nboolean:" + booleanA + " byte:" + byteA + " char:" + charA + " short:" + shortA + " int:" + a + " float:" + c + " long:" + b + " double:" + d);

        strA = "пробуем границы";
        byteA += 2;
        a += 2;
        shortA += 2;
        charA += 31;

        System.out.println(strA + " char:" + charA + " byte:" + byteA + " short:" + shortA + " int a:" + a);

        System.out.println(task3(a,b,c,d));
        System.out.println(task3d(a,b,c,d));
        System.out.println(task4(a,b));
        int x = -1;
        task5(x);
        System.out.println(task6(x));
        task7("Димитрий");
        task8(2020);
    }
    private static float task3 (float a, float b, float c, double d){
        return (float) (a * (b + (c / d)));
    }
    private static double task3d (double a, double b, double c, double d){
        return a * (b + (c / d));
    }
    private static boolean task4 (double a, double b) {return a + b <= 20 && a + b >= 10;}
    private static void task5(int x)
    {
        String textOut = "число положиельное";
        if (x<0) textOut = "число отрицательное";
        System.out.println(textOut);
    }
    private static boolean task6(int x)    {if (x<0) return true;return false;}
    private static void task7(String message){
        System.out.println("Привет "+ message);
    }
    private static void task8 (int year)
    {
        if(((year % 4 ==0) && (year % 100 !=0)) || (year % 400==0))
            System.out.println("Год " + year + " високосный");
        else{
            System.out.println("Год " + year + " не високосный");
        }
    }
}
