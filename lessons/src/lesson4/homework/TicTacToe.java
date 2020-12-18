package lesson4.homework;
// Крестики нолики. проверка победы путём сравнения соседних элементов и сщётчика. также проверяется произвольные диагонали данной длинны со здвигом вверх вних по Y
// ученик Димитрий Рыцк

import java.util.Random;
import java.util.Scanner;

public class TicTacToe {
    //Создание игрового поля.
    public static char[][] map;
    public static final int SIZE = 9; //размер поля, проверенно до размера 10 000 x 10 000 но от 10 не влезают шапки
    public static final int DOTS_TO_WIN = 3; // нужно для победы

    //Ячейки поля.
    public static final char DOT_EMPTY = '.'; // пустое поле
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
                System.out.println("Победила случайность");
                break;
            }
            if (isMapFull()) {
                System.out.println("Ничья");
                break;
            }
        }
        System.out.println("Игра закончена");
    }

    //заполнение символами пустоты.
    public static void initMap() {
        map = new char[SIZE][SIZE];
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                map[i][j] = DOT_EMPTY;
            }
        }
    }

    //Вывод поля. Первый цикл i печатает шапку игрового поля. внутренний j цикл отвечает за печать одной строки, после одной строки перевод каретки на следующую строку System.out.println(). После этого счетчик i увеличивается и производится печать следующих строк. После распечатки всего поля ставится дополнительная пустая строка для разделения выводов полей.
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

    //Ход человека.
    public static void humanTurn() {
        int x, y;
        do {
            System.out.println("Введите координаты в формате X Y");
            x = sc.nextInt() - 1;
            y = sc.nextInt() - 1;
        } while (!isCellValidAndEmpty(x, y));
        map[x][y] = DOT_X;
    }

    //Проверка возможности установки фишки в указанную ячейку. Если координаты указывают на занятое поле, либо находятся за его пределами возвращаем false, в противном случае – true.
    public static boolean isCellValidAndEmpty(int x, int y) {
        if (x < 0 || x >= SIZE || y < 0 || y >= SIZE) return false;
        if (map[x][y] == DOT_EMPTY) return true;
        return false;
    }

    //Ход компьютера. rand.nextInt(n) возвращает случайное число в диапазоне от 0 до n – 1 включительно.
    public static void aiTurn() {
        int x, y;
        do {
            x = rand.nextInt(SIZE);
            y = rand.nextInt(SIZE);
        } while (!isCellValidAndEmpty(x, y));
        System.out.println("Компьютер походил в точку " + (x + 1) + " " + (y + 1));
        map[x][y] = DOT_O;
    }

    // Собственно ДЗ
//Проверка победы по горизонталям, вертикалям и диагоналям зделанна сравнением соседних элементов и счёчиком n. Если равны сщётчик увеливается. если нет устанавливается снова в 1.
// для упращения, границы сканирования пренебрегаются, и проверка валидности делается внутри areCellsEqual(соседние координаты)
// включая со здвигом по диагоналям при размере больше 3
    public static boolean checkWin() {
        // проверка по строкам
        int n = 1;
        for (int y = 0; y < SIZE; y++) {
            for (int x = 0; x < SIZE; x++) {
                if (areCellsEqual(x, y, x + 1, y)) n++;
                else n = 1;
                if (n == DOTS_TO_WIN) return true;
            }
        }
        // по столбцам
        for (int x = 0; x < SIZE; x++) {
            for (int y = 0; y < SIZE; y++) {
                if (areCellsEqual(x, y, x, y + 1)) n++;
                else n = 1;
                if (n == DOTS_TO_WIN) return true;
            }
        }
        // по всем возможным основным (нисходящим) диагоналям включая со сдвигом d вверх вниз по Y
        for (int d = -SIZE; d < SIZE; d++) {
            for (int i = 0; i < SIZE; i++) {
                if (areCellsEqual(i, i - d, i + 1, i + 1 - d)) n++;
                else n = 1;
                if (n == DOTS_TO_WIN) return true;
            }
        }
        // по всем возможным побочным (восходящим) диагоналям включая со сдвигом d вверх вних по Y
        for (int d = -SIZE; d < SIZE; d++) {
            for (int i = 0; i < SIZE; i++) {
                if (areCellsEqual(i, SIZE - 1 - i - d, i + 1, SIZE - i - 2 - d)) n++;
                else n = 1;
                if (n == DOTS_TO_WIN) return true;
            }
        }
        return false;
    }

    // элемент существует и уже схожен ?
    public static boolean isCellValidAndNotEmpty(int x, int y) {
        return !(x < 0 || x >= SIZE || y < 0 || y >= SIZE || (map[x][y] == DOT_EMPTY));
    }

    // соседние элементы существуют схожены и равны ?
    public static boolean areCellsEqual(int x, int y, int x1, int y1) {
        if (!isCellValidAndNotEmpty(x, y) || !isCellValidAndNotEmpty(x1, y1)) return false;
        return map[x][y] == map[x1][y1];
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
