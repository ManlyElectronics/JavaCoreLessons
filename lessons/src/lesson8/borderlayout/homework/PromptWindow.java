package lesson8.borderlayout.homework;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PromptWindow extends JFrame {

    public static String output;

    public PromptWindow() {

        setBounds(200, 350, 100, 100);
        setTitle("Demo");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        JTextField field = new JTextField();
        add(field);
        field.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                System.out.println("Your message: " + field.getText());
                output = field.getText();

            }
        });
        setVisible(true);
    }

    public static void main(String[] args) {
        new PromptWindow();
    }
}

