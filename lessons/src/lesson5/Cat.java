package lesson5;


public class Cat {

    protected String name;
    protected String color;
    private int age;
    private static int catCount;

    public static void getCatCount(){
        System.out.println("Количество котиков: " + catCount);
    }

    public Cat(String name, String color, int age) {
        this.name = name != null ? name.toUpperCase() : null;
        this.color = color != null ? color.toUpperCase() : null;
        this.age = age;

        catCount++;
    }

    public Cat(String name) {
        this(name, null, 0);
    }

    public void printInfo() {
        System.out.println(this);
    }

    public String toString() {
        return "Котика зовут " + name + '\'' + ", color='" + color + '\'' + ", age=" + age + '}';
    }

    public void voice(String word) {
        System.out.printf("Кот %s сказал: %s%n", name, word);
    }

    public void setAge(int age) {
        if (age >= 0 && age < 30) {
            this.age = age;
        } else {
            System.err.println("Неверный возраст!");
        }
    }

    public int getAge() {
        return age;
    }

    protected void finalize() throws Throwable {
        catCount--;
        System.out.println("Котик " + name + " сбежал");
    }
}
