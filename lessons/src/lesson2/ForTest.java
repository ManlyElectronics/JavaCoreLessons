package lesson2;

public class ForTest {

    public static void main(String[] args) {
        forSimple();
        // ForSycle();
    }

    private static void forSimple() {
        int i =0;
        for (; i<10; i++,print(i))
        {if (i==5) return; } // прерывание
        System.out.println("final "+i);
    }
    private  static  void print(int i) {System.out.println(i);}
    private static void ForSycle() {
        final int STEPS = 15;
        final int STOP_DIGIT = 9;
        final int DIVIDER = 2;

       /* int i = 0;
        for (; i < STEPS; i++ ) {
            System.out.println(i);
        }

        System.out.println("final: " + i);*/
        int n = 0;
/*        for(    ;   ;    ){
            System.out.println();
        }*/
        for (int i = 0; i < STEPS; i++)
        {
            if (i == STOP_DIGIT) {
                break;
            }

            if (i % DIVIDER == 0) {
                continue;
            }

            System.out.println(i);

        }
    }

}
