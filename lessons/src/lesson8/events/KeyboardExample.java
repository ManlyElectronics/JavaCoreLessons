package lesson8.events;
// выводит просто поле

import javax.swing.*;

class KeyboardExample extends JFrame {

    KeyboardExample() {
        setTitle("Java Window");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setBounds(200, 300, 200, 200);
        setVisible(true);
        JTextField field = new JFormattedTextField();
        add(field);

        field.addActionListener(new KeyboardListener());

        field.addActionListener(e -> {
            System.out.println(field.getText());
            field.setText("");
        });


    }

    public static void main(String[] args) {
        KeyboardExample myWindow = new KeyboardExample();
    }
}


