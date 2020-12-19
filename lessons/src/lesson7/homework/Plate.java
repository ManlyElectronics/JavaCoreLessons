package lesson7.homework;

/*
При создании тарелки мы можем указать начальное значение food. В процессе работы с помощью метода info() можно вывести в консоль информацию о тарелке.
 */
public class Plate {
    private int food; // колличесво еды


    public Plate(int food) {
        this.food = food;
    }

    public int getFood() { // дайт сколько еды в тарелке
        return food;
    }

    public void setFood(int food) { // заполняет тарелку

        this.food = food;
        System.out.println("В тарелку положено " + food);
    }

    public boolean decreaseFood(int n) {
        if (food < n){ // если затребованно еды больше чем есть ничего не происходит и decreaseFood -> false
            return false;
        }
        food -= n; return true;
    }

    public void info() {  // вывод сколько в тарелке
        System.out.println("в тарелке: " + food);
    }
}
