package lesson7.oop;

public class Test {
    public static void main(String[] args) {
        Cat cat = new Cat("Barsik", 5); // создаётся кот
        Plate plate = new Plate(100); // создаётся тарелка
        plate.info(); // сколько в тарелке
        cat.eat(plate); // кот ест из тарелки
        plate.info(); // сколько в тарелке
    }
}
