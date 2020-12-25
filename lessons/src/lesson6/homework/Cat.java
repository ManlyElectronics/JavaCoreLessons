package lesson6.homework;

public class Cat extends Animal {
    Cat(int runLimit, double jumpLimit, int swimLimit) {
        super(runLimit, jumpLimit, swimLimit);
    }

    @Override
    public boolean swim(int distance) {
        System.out.println("кот не может плавать ");
        return false;
    }

}
