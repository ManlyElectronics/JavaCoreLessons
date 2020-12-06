package lesson4;

import java.util.Random;
import java.util.Scanner;

public class X0sMy {
    //1. Создание игрового поля. Игровое поле можно представить в виде символьного двумерного массива размером 3х3. В каждой ячейке массива могут находиться символы 'X’, ‘O’, ‘•’, которые означают фишки игроков и пустое поле. Для указания размера поля и количества фишек для победы добавим две константы SIZE и DOTS_TO_WIN.
    public static char[][] map;
    public static final int SIZE = 3;
    public static final int DOTS_TO_WIN = 3;

    //    2. Ячейки поля. Чтобы не забыть, какой символ за что отвечает, их можно записать в именные константы.
    public static final char EMPTY = '.';
    public static final char DOT_X = 'X';
    public static final char DOT_O = 'O';
    public static Scanner sc = new Scanner(System.in);
    public static Random rand = new Random();

    public static void main(String[] args) {
        initMap();
        // TestFillMap();
        printMap();

        while (true) {
            humanTurn();
            printMap();
            if (checkWin()) {
                System.out.println("Победил человек");
                break;
            }
            if (isMapFull()) {
                System.out.println("Ничья");
                break;
            }
            aiTurn();
            printMap();
            if (checkWin()) {
                System.out.println("Победил Искуственный Интеллект");
                break;
            }
            if (isMapFull()) {
                System.out.println("Ничья");
                break;
            }
        }
        System.out.println("Игра закончена");
    }




// 3. Инициализация поля. При запуске программы необходимо инициализировать поле и заполнить все его ячейки символом, обозначающим пустое поле. Заполнение происходит за счёт того, что двойной цикл «пробегает» по всем ячейкам массива и в каждую ячейку записывает символ DOT_EMPTY.
    public static void initMap() {
        map = new char[SIZE][SIZE];
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                map[i][j] = EMPTY;
            }
        }
    }

    public static void TestFillMap() {

        //for (int i = 0; i < SIZE; i++) {
        int y =0;
            for (int j = 0; j < SIZE; j++) {
                map[j][y] = DOT_X;
            }
        //}
    }

//    4. Вывод поля в консоль. Проинициализированное поле готово. Теперь необходимо вывести его в консоль.Первый цикл i отвечает за распечатку шапки игрового поля. Далее идёт двойной цикл i, j, внутренний j цикл отвечает за печать одной строки, после того как одна строка отпечаталась в консоль (закончился цикл j), происходит перевод каретки на следующую строку методом System.out.println(). После этого счетчик i увеличивается и производится печать следующих строк. После распечатки всего поля ставится дополнительная пустая строка для разделения выводов полей.
    public static void printMap() {
        for (int i = 0; i <= SIZE; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i = 0; i < SIZE; i++) {
            System.out.print((i + 1) + " ");
            for (int j = 0; j < SIZE; j++) {
                System.out.print(map[j][i] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

//    6. Ход человека. Теперь можно сделать метод, отвечающий за ход человека-игрока.

    public static void humanTurn() {
        int x, y;
        do {
            System.out.println("Введите координаты в формате X Y");
            x = sc.nextInt() - 1;
            y = sc.nextInt() - 1;
        } while (!isCellValid(x, y));
        map[x][y] = DOT_X;
    }

//    7. Проверка ячеек. Метод isCellValid() проверяет возможность установки фишки в указанную ячейку.Если введены неверные координаты (либо указывают на занятое поле, либо находятся за его пределами), возвращаем false, в противном случае – true.
    public static boolean isCellValid(int x, int y) {
        if (x < 0 || x >= SIZE || y < 0 || y >= SIZE) return false;
        return map[x][y] == EMPTY;
    }

// 8. Ход компьютера. Для реализации хода компьютера достаточно чуть изменить метод хода игрока, добавив туда генератор случайных чисел.
//Метод rand.nextInt(n) возвращает случайное число в диапазоне от 0 до n – 1 включительно.

    public static void aiTurn() {
        int x, y;
        do {
            x = rand.nextInt(SIZE);
            y = rand.nextInt(SIZE);
        } while (!isCellValid(x, y));
        System.out.println("Компьютер походил в точку " + (x + 1) + " " + (y + 1));
        map[x][y] = DOT_O;
    }
// 9. Проверка победы. Если хотя бы одна будет найдена, вернуть true. В приведённом ниже варианте производится проверка всех возможных комбинаций с помощью 8 условий, для поля 3х3 такой подход может быть оправдан. Если размер поля или длину выигрышной серии можно будет увеличить, лучше найти другой вариант проверки победы, например, через циклы(для поля 4х4 придется написать уже не 8, а 24 условия).
    public static boolean checkWin() {
        // TO DO
        // проверка по строкам
        int n = 1;
        for (int y = 0; y < SIZE ; y++) {
                for (int x = 0; x < SIZE - 1; x++) {
                    if ((map[x][y] != EMPTY) && (map[x + 1][y] == map[x][y]))
                        n++;
                    else n = 1;
                    if (n == DOTS_TO_WIN) return true;
                }
            }
        // по столбцам
        for (int x = 0; x < SIZE ; x++) {
            for (int y = 0; y < SIZE - 1; y++) {
                if ((map[x][y] != EMPTY) && (map[x][y+1] == map[x][y]))
                    n++;
                else n = 1;
                if (n == DOTS_TO_WIN) return true;
            }
        }
        // по диагонали
        for (int i= 0; i < SIZE-1 ; i++) {
                if ((map[i][i] != EMPTY) && (map[i+1][i+1] == map[i][i]))
                    n++;
                else n = 1;
                if (n == DOTS_TO_WIN) return true;
        }
        // TO DO
        // по побочной диагонали
        int S = SIZE-1;
        for (int i= 0; i < SIZE ; i++) {
            System.out.printf("map[%d]=%s\n",i,map[i][S-i]);
            if ((map[i][S-i] != EMPTY) && (map[i+1][S-i-1] == map[i][S-i]))
                n++;
            else n = 1;
            if (n == DOTS_TO_WIN) return true;
        }
        return false;
    }

    public static boolean isMapFull() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (map[i][j] == EMPTY) return false;
            }
        }
        return true;
    }
}
