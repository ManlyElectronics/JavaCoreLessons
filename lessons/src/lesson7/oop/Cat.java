package lesson7.oop;

/* У кота есть кличка и аппетит - сколько единиц еды он потребляет за приём пищи. Эти поля мы заполняем с помощью конструктора. Также есть метод eat(), который заставляет кота покушать, но пока что он пустой, так как неизвестно, откуда кот должен брать еду.
 */
public class Cat {
    private String name;
    private int appetite;
    private Plate plate;

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
    }

    public void eat(Plate plate) {
        this.plate = plate;
        plate.decreaseFood(appetite);
        System.out.println(this.name + " ест");
    }
}
