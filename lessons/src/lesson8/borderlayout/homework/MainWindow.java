package lesson8.borderlayout.homework;
// выводит просто поле

import javax.swing.*;

class MainWindow extends JFrame {

    MainWindow() {
        setTitle("Java Window");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setBounds(300, 400, 300, 200);
        setVisible(true);
        JLabel label1 = new JLabel("привет");
        label1.setText(PromptWindow.output);
        add(label1);
        PromptWindow promptwindow = new PromptWindow();


    }

    public static void main(String[] args) {
        MainWindow myWindow = new MainWindow();
    }

}


