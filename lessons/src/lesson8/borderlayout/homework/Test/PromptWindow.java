package lesson8.borderlayout.homework.Test;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PromptWindow extends JFrame {

    public static String outputMessage;

    public PromptWindow() {

        setBounds(500, 300, 100, 100);
        // setTitle("Demo");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        JTextField field = new JTextField();
        add(field);
        field.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                System.out.println("Your message: " + field.getText());
                outputMessage = field.getText();

            }
        });
        setVisible(true);
        System.out.println("Your message: " + outputMessage);
    }

    public static void main(String[] args) {
        new PromptWindow();
    }
}

