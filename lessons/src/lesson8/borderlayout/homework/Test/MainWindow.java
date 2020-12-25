package lesson8.borderlayout.homework.Test;
// выводит просто поле

import javax.swing.*;

class MainWindow extends JFrame {

    MainWindow() {
        setTitle("Java Window");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setBounds(250, 300, 200, 200);
        setVisible(true);
        JLabel label1 = new JLabel();
        label1.setText(PromptWindow.outputMessage);
        add(label1);
        PromptWindow promptwindow = new PromptWindow();


    }

    public static void main(String[] args) {
        MainWindow myWindow = new MainWindow();
    }

}



