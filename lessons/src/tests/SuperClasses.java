package tests;

public class SuperClasses {
    static class Animal {
        int distance;
        int limit = 100;
        boolean Action(int distance) {
            return distance <= limit;
        }
    }
    static class Dog extends Animal {

    };

    public static void main(String[] args) {
        Dog MyDog = new Dog();
        System.out.println(MyDog.Action(10));
    }
}
