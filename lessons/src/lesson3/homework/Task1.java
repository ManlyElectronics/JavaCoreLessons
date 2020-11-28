package lesson3.homework;
import java.util.Random;
import java.util.Scanner;

public class Task1 {
    public static Scanner sc =new Scanner(System.in);
    public static void main(String[] args) {
        int max =9;
        String message = "Введите число в пределах от 0 до 9";
        int d =1;
        while (d==1){
            Random rand = new Random();
            int x = rand.nextInt(max);
            // System.out.println(x);
            for (int i=0; i<3; i++) AskAndChekNumber(x, max, message + ", у вас осталось " + (3 - i) + " попытки" );
            d = AsksNumber("Число было "+ x +". Повторить игру еще раз? 1 – да / 0 – нет", 0, max);
        }
    }
    private static void AskAndChekNumber(int x, int max, String message) {
        int d = AsksNumber(message, 0, max);
        if (d== x) message = "вы угадали!";
        else if (d< x) message = "загаданное число больше";
        else message = "загаданое число меньше";
        System.out.println(message);
    }

    public static int AsksNumber(String message, int min, int max) {
        int x;
        do {
            System.out.println(message);
            x = sc.nextInt();
        } while (x < min || x > max);
        return x;
    }
}
