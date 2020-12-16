package lesson5.homework;

import java.util.Random;

public class Homework {

    private static final int EMPLOYEE_COUNT = 5;
    private static final int MIN_AGE = 40;
    private static final Random ageRandomize = new Random();

    public static void main(String[] args) {

        Сотрудник[] сотрудникИ = new Сотрудник[EMPLOYEE_COUNT];
        for (int i = 0; i < EMPLOYEE_COUNT; i++) {
            сотрудникИ[i] = createEmployee(i);
        }
        System.out.println("ID   Фамилия    Имя     Отчество    должность             email            телефон     зарплата  возраст");
        for (Сотрудник сотрудник : сотрудникИ) {
            if (сотрудник.getВозраст() > MIN_AGE) {
                сотрудник.printInfo();
            }
        }

    }

    private static Сотрудник createEmployee(int i) {
        return new Сотрудник(
                "Фамилия" + i,
                "Имя" + i,
                "Отчество" + i,
                "Software Engineer " + i,
                "test" + i + "@test.com",
                "+7920555778" + i,
                2000 + i * 100,
                ageRandomize.nextInt(30) + 30);
        // ,
        // 2000 + i * 100);
    }
}
