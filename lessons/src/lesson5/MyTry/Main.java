package lesson5.MyTry;

public class Main {
    public static void main(String[] args) {
        //Cat cat1 = new Cat("Вася", 2); // Способ 2 задание переменных при создании, НО они должны быть определены как this в методе класса
        int NUMBER = 3;

        Cat[] cats = new Cat[NUMBER];

        for (int i = 0; i < NUMBER; i++) {
            cats[i] = makeCat(i);
           // cats[i] = new Cat("Имя " + i, i);
           //System.out.println(cats[i].Имя + "  "+ cats[i].Возраст);
            cats[i].printInfo();
            // cats[i].info();
        }
        Cat cat1 = new Cat(); // как передать методу Cat в классе какое имя здесь, те cat2 ?
        // задание уникальных переменных обьектов
        // Способ 1
        cat1.Имя = "Гоша";// overrides присвоение в class
        // cat2.Отчество = "Александровна"; // можно определить
        cat1.printInfo();
        // System.out.println("cat1.Имя: " + cat1.Имя);
    }

    private static Cat makeCat(int i) {
        return new Cat("Имя " + i, i);
    }
}
