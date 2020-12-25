package lesson5.MyTry;

class Cat {
    String Имя = "Имя по умолчанию";
    int Возраст = 1;
    String color = "не задан";


    Cat(String name, int age) {
        this.Имя = name; // если не определять здесь берётся по умолчанию
        this.Возраст = age;
// Зачем задавать параметры через метод ?
    }

    Cat() {
        //  String name = "неизвестное имя";
        System.out.println("подобрал безимянного кота");
    }

    public void printInfo() {
        System.out.println("Имя: " + this.Имя + "  Возраст: " + this.Возраст + " Цвет :" + color);
    }

    public void info() {
        System.out.println(this);
    }


    @Override
    public String toString() {
        return "Имя: " + this.Имя + "  Возраст: " + this.Возраст;
    }

}
