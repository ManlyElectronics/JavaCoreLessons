package tests;

class staticdemo {
    int x =1;
    static int y =2;

    int sum (int x, int y) {
        return x + y;
    }


}

class SDemo {
    public static void main(String[] args) {
        staticdemo sd1 = new staticdemo();
        staticdemo sd2 = new staticdemo();

        System.out.println(sd1.x);
        System.out.println(sd1.y);
        sd1.x = 0;
        sd1.y = 0; // изменили на 0 y обекта sd1
        System.out.println(sd2.x);
        System.out.println(sd2.y); // но и Sd2 имзенился потоммучто y static
        System.out.println(staticdemo.y);
       // System.out.println(staticdemo.x);
    }
}
