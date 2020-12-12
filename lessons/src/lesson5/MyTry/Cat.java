package lesson5.MyTry;

public class Cat {
protected String Имя = "Имя по умолчанию";
protected String Фамилия = "Фамилия по умолчанию";
protected String Отчество = "Отчество по умолчанию";
protected int Возраст =1;

public Cat (String name, String surname, String patronymic, int age){
    // this.Имя = name; // если не определять здесь берётся по умолчанию
    this.Фамилия = surname;
    this.Отчество = patronymic;
    this.Возраст = age;
// Зачем задавать параметры через метод ?
}

    public Cat() {
      //  String name = "неизвестное имя";
        System.out.println("Кот безимянный");
    }
}
