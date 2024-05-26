import javax.swing.*;
import javax.swing.event.*;
import java.awt.event.*;
import java.awt.*;
import java.io.*;

public class MyMain
{

    public static void main(String[] args)
    {
        InitFrame frame = new InitFrame();

        JLabel label = new JLabel();
        label.setBackground(Color.black);
        label.setOpaque(true);
        label.setPreferredSize(new Dimension(100,100));


        JButton button = new JButton("Change Color");
        button.addActionListener(e -> {
            JColorChooser colorChooser = new JColorChooser();

            Color color = JColorChooser.showDialog(null, "Pick up a color you want", Color.blue);
            label.setBackground(color);
        });
        
        frame.add(button);
        frame.add(label);
        frame.pack();
        frame.setVisible(true);

    }

}