package lesson5;

import lesson4.*;

public class Main {


    public static void main(String[] args) {
        Cat cat1 = new Cat("Мартин Лютер Кот", "Афрокот", 2);
        Cat cat2 = new Cat("Борис Николаевич", "Рыжий", 3);
        Cat cat3 = new Cat("Шава");
        Cat cat4 = new Cat("Потолок");

//        cat3.age = 100;
        cat3.setAge(40);

        cat4 = null;
        System.gc();


       /* cat1.printInfo();
        cat2.printInfo();
        cat3.printInfo();

        cat1.voice("Добрый вечер");
        cat2.voice("И Вам здравствия");*/

        Math.random();
        Cat.getCatCount();

        Cat[] catsArr = {cat1, cat2, cat3};

        for (Cat cat : catsArr) {
            cat.printInfo();
        }

//        cat1.getCatCount();
//        cat2.getCatCount();
        Cat.getCatCount();


//        TicTacToe.turnGame();
    }

}
