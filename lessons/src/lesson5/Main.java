package lesson5;

public class Main {


    public static void main(String[] args) {
        Cat cat1 = new Cat("1", "белый",2);
        Cat cat2 = new Cat("2", "рыжий", 3);
        Cat cat3 = new Cat("3");
       // Cat cat4 = new Cat("4");

       // cat3.age = 100;
        // cat3.setAge(4);

        // cat4 = null;
        System.gc();


       /* cat1.printInfo();
        cat2.printInfo();
        cat3.printInfo();

        cat1.voice("Добрый вечер");
        cat2.voice("И Вам здравствия");*/

        // Math.random();
        // Cat.getCatCount();

        Cat[] catsIndex = {cat1, cat2, cat3};

        for (Cat cat : catsIndex) {
            cat.printInfo();
        }

//        cat1.getCatCount();
//        cat2.getCatCount();
        Cat.getCatCount();


    }

}
