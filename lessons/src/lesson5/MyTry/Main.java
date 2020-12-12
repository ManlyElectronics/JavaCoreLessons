package lesson5.MyTry;

public class Main {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Вася", "Котовский", "зелёный", 2);
        Cat cat2 = new Cat(); // как передать методу Cat в классе какое имя здесь, те cat2 ?
        // задание уникальных переменных обьектов
        // Способ 1
        // cat1.Имя = "Гоша";
        cat2.Отчество = "Александровна"; // можно определить
        System.out.println(cat1.Имя);
        cat1.Имя = "Петя";
        System.out.println(cat1.Имя);
        System.out.println(cat1.Фамилия);
        cat1.Фамилия = "Котяра";
        System.out.println(cat1.Фамилия);

    }
}
