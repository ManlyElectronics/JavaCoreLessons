package lesson3.homework;
//Создать массив из слов // * Сделанно
// слово = случайно // * Сделанно
// * Сделать
// цикл 1: i< длинна слова.
// ответ пользователя // Сделано
// ответ == слово ? // Сделано
//   да -> угадали ! // Сделано
//   нет -> нет - > показывается i букв из слова + ..   -> цикл 1
//Играем до тех пор, пока игрок не отгадает слово. Используем только маленькие буквы.

//String str = "apple"; char a = str.charAt(0); - метод, вернет char, который стоит в слове str на первой позиции

import java.util.Random;
import java.util.Scanner;

public class Task2 {
    public static Scanner sc =new Scanner(System.in);
    public static void main(String[] args) { String[] words = new String[]{ "apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli", "carrot", "cherry", "garlic", "grape", "melon", "leak", "kiwi",
                "mango", "mushroom", "nut", "olive", "pea", "peanut", "pear", "pepper", "pineapple", "pumpkin", "potato" };
    String message = "угадайте слово";
    String word = RandomWordFromArr(words);
    System.out.println(word);// тест подсказка
    while (!message.equals(word)){
        message = AsksString(message);
        }
    System.out.println("Угадали!");
    }

    private static String RandomWordFromArr(String... A) {
        int length = A.length;
        Random rand = new Random();
        int x = rand.nextInt(length);
        return A[x];
    }
    public static String AsksString(String message) {
        String answer;
        System.out.println(message);
        answer = sc.next();
        return answer;
    }

}
