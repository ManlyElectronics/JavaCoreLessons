package lesson7.homework;

public class Test {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Барсик", 60, false); // создаётся кот
        Cat cat2 = new Cat("Тимофей", 150, false);
        Plate plate = new Plate(100); // создаётся тарелка
        plate.info(); // выводим сколько в тарелке
        cat1.eat(plate); // кот ест из тарелки
        System.out.println("cat1 сытый ? " + cat1.isFull);
        plate.info();
        cat2.eat(plate);
        plate.info();
        System.out.println("cat2 сытый ? " + cat2.isFull);
        Cat[] cats = {
                new Cat("кот1", 10, false),
                new Cat("кот2", 20, false),
                new Cat("кот3", 30, false),
                new Cat("кот4", 40, false),
                new Cat("кот5", 50, false),
        };
        Plate plate_for_cats = new Plate(100); // создаётся тарелка для котов
        for (Cat cat : cats) {
            cat.eat(plate_for_cats); // кормим котов
        }
        for (Cat cat : cats) { // проверяем сытость
            System.out.println(cat.name + " сытый ? " + cat.isFull);
        }
        plate.setFood(100); // добавляем в тарелку
        plate.info(); // проверяем сколько стало в тарелке
    }
}
