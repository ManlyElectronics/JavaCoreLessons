package lesson4;

public class PrintFTest {
    public static void main(String[] args) {
        int charNumber = 'А';
        String strA = "Привет. \n Вот строка";
        char charA = (char) charNumber;
        byte byteA = 127;
        short shortA = 32767;
        int a = 2147483647;
        long b = 127L;
        float c = 127f;
        double d = 127;
        boolean booleanA = true;

        System.out.printf("цифра %d\n",charNumber);
        System.out.printf("цифра байт %d\n",byteA);
        System.out.printf("цифра short %d\n", shortA);
        System.out.printf("цифра int %d\n", a);
        System.out.printf("цифра long %d\n", b);
        System.out.printf("цифра float %f\n", c);
        System.out.printf("цифра double %f\n", d);
        System.out.printf("цифра boolean %s\n", booleanA);

    }
}
