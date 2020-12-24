package tests.inheretance;

class Shape {
    double width;
    double height;

    void showShapeInfo() {
        System.out.println("ширина и высота -" + width + " и " + height);
    }
/* Shape(int width, int height){
        this.height = height;
        this.width = width;
}*/
    @Override
    public String toString() {
        return "Shape{" +
                "width=" + width +
                ", height=" + height +
                '}';
    }
    void info (){
        System.out.println(this);
    }
}
// конец суперкласса
// начало подкласса
class Triangle extends Shape {
        String style;
        double area(){
            return width * height/2;
        }
        void showTriangleStyle(){
            System.out.println("треугольник " + style);
        }

    @Override
    public String toString() {
        return "Triangle{" + super.toString() +
                ", style='" + style + '\'' +
                '}';
    }


}

class Shapes {
    public static void main(String[] args) {
        Triangle t1 = new Triangle();
        Triangle t2 = new Triangle();

        t1.width =4;
        t1.height=4;
        t1.style="закрашенный";


        t2.width =18;
        t2.height=12;
        t2.style="контурный";

        Shape s1 = new Shape();

        // System.out.println(s1);
        // System.out.println(t1);
        //System.out.println(t2);
        //s1.showShapeInfo();

        s1.info();// берёт метод в общей фигуре и toString в описании общей фигуры
        t1.info(); // берёт метод в общей фигуре и toString в описании треугольника!
        t2.info();

        }

    }


