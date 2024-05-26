import javax.swing.*;
import java.awt.*;

public class MyMain
{
    public static void main(String[] args)
    {
        InitFrame frame = new InitFrame();

        JButton button = new JButton("Confirm");

        JTextField textField = new JTextField(); 
        textField.setPreferredSize(new Dimension(150, 50));
        textField.setBackground(Color.black);
        textField.setForeground(Color.green);

        button.addActionListener( e ->{
            System.out.println("Hello " + textField.getText());
            button.setEnabled(false);
            textField.setEditable(false);
        });
        frame.setLayout(new FlowLayout());
        frame.add(textField);
        frame.add(button);

        frame.setVisible(true);
    }
}