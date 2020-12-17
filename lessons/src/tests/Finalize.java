package tests;

public class Finalize {
    public static void main(String[] args) {
        int i;
        FDemo ob = new FDemo(0);
        for (i = 0; i < 1000000; i++) {
ob.generator(i);
        }
    }
    public static class FDemo {
        int х;
        FDemo(int i) {
            х = i;
        }
        // Вызывается при удалении объекта
        protected void finalize() {
            System.out.println("Финaлизaция " + х);
        }
// Генерирует объект, который тотчас уничтожается
            protected  void generator(int i){
                FDemo o = new FDemo(i);
            }
        }
}