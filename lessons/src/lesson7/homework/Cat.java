package lesson7.homework;

/* У кота есть кличка и аппетит - сколько единиц еды он потребляет за приём пищи. Эти поля мы заполняем с помощью конструктора. Также есть метод eat(), который заставляет кота покушать, но пока что он пустой, так как неизвестно, откуда кот должен брать еду.
 */
public class Cat {
    String name;
    private int appetite;
    boolean isFull;

    public Cat(String name, int appetite, boolean isFull) {
        this.isFull = isFull;
        this.name = name;
        this.appetite = appetite;
    }

    public void eat(Plate plate) {
        if (plate.getFood() < appetite) {
            System.out.println("коту " + this.name + " мало в тарелке");
            this.isFull = false;
            return;
        }
        plate.decreaseFood(appetite);
        System.out.println(this.name + " ест");
        this.isFull = true;
    }

}
