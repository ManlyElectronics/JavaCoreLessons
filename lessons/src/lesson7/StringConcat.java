package lesson7;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class StringConcat {
    public static void main(String[] args) throws IOException {


        String a1 = "Hello my";
        String a2 = "Dear world";
        // String a3 = a1 +a2;
        String a3 = a1.concat(a2);

        String b1 = "Число ";
        int b2 = 10;
        // String b3 = b1 + b2;
//        String b3 = b1.concat(String.valueOf(b2));
//    System.out.println(b3);

        for (char c1 : a1.toCharArray()) { // какое индекс в массиве ?
            System.out.println("Символ: " + c1);
        }
        System.out.println(a1.toCharArray());
        for (String word : a3.split("\s")) {
            System.out.println("Word: " + word);
        }
        System.out.println(a1.compareTo(a2)); // сравнивается по буквенно
        // String space = null;
        // String space = "";
        String space = "   ";
        System.out.println(space == null);
        System.out.println(space.isEmpty());
        System.out.println(space.isBlank());

        System.out.println(a3.substring(6, 16));
        System.out.println(a3.replace("l", "L"));
        System.out.println(a3.indexOf(" "));
        System.out.println(a3.charAt(0));

        // File file;
        // file = new File("D:\\Documents\\GitHub\\JavaCoreLessons\\lessons\\src\\lesson7\\test.txt");

        var file = new File("src\\lesson7\\test.txt");
        FileInputStream is = new FileInputStream(file);
        // System.out.println(new String(is.readAllBytes()));
        StringBuilder sb = new StringBuilder();
        int n;
        while ((n = is.read()) != -1) { // пока не кончился файл
            sb.append((char) n); // не читает файл с русскими сохранённый как UTF8
        }
        System.out.println(sb.toString());


    }
}
