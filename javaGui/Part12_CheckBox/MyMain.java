import javax.swing.*;
import java.awt.*;

public class MyMain
{
    public static void main(String[] args)
    {
        InitFrame frame = new InitFrame();

        ImageIcon initimage = new ImageIcon("incorrect.png");
        ImageIcon image = new ImageIcon("correct.png");

        JButton button = new JButton("Submit");

        JCheckBox checkBox = new JCheckBox();
        checkBox.setText("I'm not robot");
        checkBox.setIcon(initimage);
        checkBox.setSelectedIcon(image);

        button.addActionListener(e -> {
            System.out.println(checkBox.isSelected());
        });
        frame.setLayout(new FlowLayout());
        frame.add(checkBox);
        frame.add(button);
        frame.pack();
        frame.setVisible(true);
    }
}