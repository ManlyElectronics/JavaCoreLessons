package lesson7.oop;

/*
При создании тарелки мы можем указать начальное значение food. В процессе работы с помощью метода info() можно вывести в консоль информацию о тарелке.
 */
public class Plate {
    private int food; // колличесво еды

    public Plate(int food) {
        this.food = food;
    }

    public void decreaseFood(int n) {
        food -= n;
    }

    public void info() {
        System.out.println("plate: " + food); // вывод сколько в тарелке
    }
}
