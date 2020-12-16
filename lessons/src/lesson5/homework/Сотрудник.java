package lesson5.homework;


public class Сотрудник {
    private static int countEmp;
    private int id;

    private String фамилия;
    private String имя;
    private String отчество;

    private String должность;

    private String email;
    private String телефон;

    private int зарплата;
    private int возраст;

    public Сотрудник(String фамилия, String имя, String отчество, String должность, String email, String телефон, int зарплата, int возраст) {
        this.имя = имя;
        this.фамилия = фамилия;
        this.отчество = отчество;
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
        return id + " |  " + фамилия + " | " + имя + " |  " + отчество + " | " + должность + " | " + email + " | " + телефон + " | " + зарплата + " | " + возраст;
    }
}
