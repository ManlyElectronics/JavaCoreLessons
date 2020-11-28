package lesson3.homework;
import java.util.Scanner;

public class Task1 {
    public static Scanner sc =new Scanner(System.in);
    public static void main(String[] args) {
        int x =5;
        String message = "Введите число в пределах от 0 до 10";
        System.out.println(x);
        int d =1;
        while (d==1){
            for (int i=0; i<3; i++) AskAndChekNumber(x, message);
            d = AsksNumber("Повторить игру еще раз? 1 – да / 0 – нет", 0, 1);
            if (d == 0) break;
        }
    }
    private static void AskAndChekNumber(int x, String message) {
        int d = AsksNumber(message, 0, 10);
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
