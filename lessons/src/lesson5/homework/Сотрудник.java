package lesson5.homework;


public class Сотрудник {
    private static int countEmp;
    private int id;

    private String Фамилия;
    private String Имя;
    private String Отчество;

    private String должность;

    private String email;
    private String телефон;

    private int зарплата;
    private int возраст;

    public Сотрудник(String Фамилия, String Имя, String Отчество, String должность, String email, String телефон, int зарплата, int возраст) {
        this.Имя = Имя;
        this.Фамилия = Фамилия;
        this.Отчество = Отчество;
        this.должность = должность;
        this.email = email;
        this.телефон = телефон;
        this.зарплата = зарплата;
        this.возраст = возраст;
        id = countEmp++;
    }


    public int getВозраст() {
        return возраст;
    }

    public void printInfo() {
        System.out.println(this);
    }

   @Override
    public String toString() {
        return id +" |  " + Фамилия + " | " + Имя + " |  " + Отчество + " | " + должность + " | " + email + " | " + телефон + " | " + зарплата + " | " +  возраст;
    }
}
