package tests.inheretance;
class ShapeWithGetters {
    private double width;
    private double height;
    double getWidth(){ return width;}
    double getHeight() {return height;}
    void setWidth(double w){width =w;}
    void setHeight(double h){height=h;}

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
class Triangle1 extends ShapeWithGetters {
        String style;
        double area(){
            return getWidth() * getHeight()/2;
        }
        void showTriangleStyle(){
            System.out.println("треугольник " + style);
        }

    @Override
    public String toString() {
        return "Triangle{" +
                "width=" + getWidth() +
                ", height=" + getHeight() +
                ", style='" + style + '\'' +
                '}';
    }


}

class ShapesWithGetters {
    public static void main(String[] args) {
        Triangle1 t1 = new Triangle1();
        Triangle1 t2 = new Triangle1();

        t1.setWidth(4);
        t1.setHeight(4);
        t1.style="закрашенный";


        t2.setWidth(18);
        t2.setHeight(18);
        t2.style="контурный";

        Shape s1 = new Shape();
        s1.width = 1;

        // System.out.println(s1);
        // System.out.println(t1);
        //System.out.println(t2);
        //s1.showShapeInfo();

        s1.info();// берёт метод в общей фигуре и toString в описании общей фигуры
        t1.info(); // берёт метод в общей фигуре и toString в описании треугольника!
        t2.info();

        }

    }


