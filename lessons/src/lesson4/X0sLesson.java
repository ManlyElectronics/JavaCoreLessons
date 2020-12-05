package lesson4;

import java.util.Random;
import java.util.Scanner;

public class X0sLesson {
    //1. Создание игрового поля. Игровое поле можно представить в виде символьного двумерного массива размером 3х3. В каждой ячейке массива могут находиться символы 'X’, ‘O’, ‘•’, которые означают фишки игроков и пустое поле. Для указания размера поля и количества фишек для победы добавим две константы SIZE и DOTS_TO_WIN.
    public static char[][] map;
    public static final int SIZE = 3;
    public static final int DOTS_TO_WIN = 3;

    //    2. Ячейки поля. Чтобы не забыть, какой символ за что отвечает, их можно записать в именные константы.
    public static final char DOT_EMPTY = '•';
    public static final char DOT_X = 'X';
    public static final char DOT_O = 'O';
    public static Scanner sc = new Scanner(System.in);
    public static Random rand = new Random();

    public static void main(String[] args) {
        initMap();
        printMap();
        while (true) {
            humanTurn();
            printMap();
            if (checkWin(DOT_X)) {
                System.out.println("Победил человек");
                break;
            }
            if (isMapFull()) {
                System.out.println("Ничья");
                break;
            }
            aiTurn();
            printMap();
            if (checkWin(DOT_O)) {
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
                map[i][j] = DOT_EMPTY;
            }
        }
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
                System.out.print(map[i][j] + " ");
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
        map[y][x] = DOT_X;
    }

//    7. Проверка ячеек. Метод isCellValid() проверяет возможность установки фишки в указанную ячейку.Если введены неверные координаты (либо указывают на занятое поле, либо находятся за его пределами), возвращаем false, в противном случае – true.
    public static boolean isCellValid(int x, int y) {
        if (x < 0 || x >= SIZE || y < 0 || y >= SIZE) return false;
        if (map[y][x] == DOT_EMPTY) return true;
        return false;
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
        map[y][x] = DOT_O;
    }
// 9. Проверка победы. Необходимо проверить все выигрышные комбинации. Если хотя бы одна будет найдена, вернуть true. В приведённом ниже варианте производится проверка всех возможных комбинаций с помощью 8 условий, для поля 3х3 такой подход может быть оправдан. Если размер поля или длину выигрышной серии можно будет увеличить, лучше найти другой вариант проверки победы, например, через циклы(для поля 4х4 придется написать уже не 8, а 24 условия).
    public static boolean checkWin(char symb) {
        if(map[0][0] == symb && map[0][1] == symb && map[0][2] == symb) return true;
        if(map[1][0] == symb && map[1][1] == symb && map[1][2] == symb) return true;
        if(map[2][0] == symb && map[2][1] == symb && map[2][2] == symb) return true;
        if(map[0][0] == symb && map[1][0] == symb && map[2][0] == symb) return true;
        if(map[0][1] == symb && map[1][1] == symb && map[2][1] == symb) return true;
        if(map[0][2] == symb && map[1][2] == symb && map[2][2] == symb) return true;
        if(map[0][0] == symb && map[1][1] == symb && map[2][2] == symb) return true;
        if(map[2][0] == symb && map[1][1] == symb && map[0][2] == symb) return true;
        return false;
    }
    public static boolean isMapFull() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (map[i][j] == DOT_EMPTY) return false;
            }
        }
        return true;
    }
}
