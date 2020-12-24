package lesson5.MyTry;

public class Cat {
protected String Имя = "Имя по умолчанию";
protected int Возраст =1;


   public Cat (String name, int age){
    this.Имя = name; // если не определять здесь берётся по умолчанию
    this.Возраст = age;
// Зачем задавать параметры через метод ?
}

   public Cat() {
      //  String name = "неизвестное имя";
        System.out.println("подобрал безимянного кота");
    }
    public void printInfo(){ System.out.println("Имя: " + this.Имя + "  Возраст: " + this.Возраст); }
    public void info(){
       System.out.println(this);
    }


    @Override
    public String toString() {
         return "Имя: " + this.Имя + "  Возраст: " + this.Возраст;
    }

}
