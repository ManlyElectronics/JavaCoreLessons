package lesson5.MyTry;

public class Massives {

        public static void main(String[] args) {
        /* int[] X = new int[2];
        // X[0] = 1;
        for (int i = 0; i < X.length; i++) {
            System.out.println(X[i]);
        }*/

            int X[][] = new int[2][2];
            int C[] = new int[3];
            for (int i = 0; i < X.length; i++) {


            }
            printMass(X);
            printMass(C);

        }

        public static void printMass(int[][] A) {
            int SIZE = A.length;
            for (int i = 0; i <= SIZE; i++) {
                System.out.print(i + " ");
            }
            System.out.println();
            for (int i = 0; i < SIZE; i++) {
                System.out.print((i + 1) + " ");
                for (int j = 0; j < SIZE; j++) {
                    System.out.print(A[i][j] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
        public static void printMass(int[] A) {
            int SIZE = A.length;
            for (int i = 0; i <= SIZE; i++) {
                System.out.print(i + " ");
            }
            System.out.println();
            for (int i = 0; i < SIZE; i++) {

                System.out.print(A[i] + " ");
            }

        }
    }


