package lesson8.borderlayout;
// выводжит сетку
import javax.swing.*;
import java.awt.*;

class GridLayoutTest extends JFrame {
    final int SIZE = 6;

    GridLayoutTest() {
        setBounds(500, 500, 500, 500);
        setTitle("GridLayoutDemo");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        JButton[] jbs = new JButton[SIZE * SIZE];
        setLayout(new GridLayout(SIZE, SIZE));
        for (int i = 0; i < jbs.length; i++) {
            jbs[i] = new JButton("#" + i);
            jbs[i].setText(".");
            add(jbs[i]);
        }
        setVisible(true);
    }

    public static void main(String[] args) {
        new GridLayoutTest();

    }
}

