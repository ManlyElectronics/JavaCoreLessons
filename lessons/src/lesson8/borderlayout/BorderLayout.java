package lesson8.borderlayout;
// выводит просто поле

import javax.swing.*;

class BorderLayout extends JFrame {

    BorderLayout() {
        setTitle("Java Window");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setBounds(200, 300, 200, 200);
        setVisible(true);

    }

    public static void main(String[] args) {
        BorderLayout myWindow = new BorderLayout();
    }
}


