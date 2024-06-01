import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.io.*;

public class MyMain
{

    public static void main(String[] args)
    {
        InitFrame frame = new InitFrame();

        ImageIcon hugFace = new ImageIcon("hug.jpeg");
        ImageIcon thinkingFace = new ImageIcon("ThinkingFace.jpeg");
        ImageIcon rollingFace = new ImageIcon("RolingFace.png");
        
        JLabel label = new JLabel();
        label.setBounds(0, 0, 100, 100);
        label.setBackground(Color.red);
        label.setOpaque(true);
        label.setIcon(rollingFace);

        label.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e)
            {
                // mouseClick : when the mouse has been click (pressed and released together) in component
                System.out.println("Hit!!!");
                // label.setBackground(Color.blue);
                label.setIcon(thinkingFace);
            }
            
            @Override
            public void mousePressed(MouseEvent e)
            {
                // mousePressed : when the mouse has been pressed in component
                System.out.println("Pressed!!!");
                // label.setBackground(Color.green);
            }

            @Override
            public void mouseReleased(MouseEvent e)
            {
                // mouseReleased : when the mouse has been released in component
                System.out.println("Released!!!");
                // label.setBackground(Color.orange);
            }

            @Override
            public void mouseEntered(MouseEvent e)
            {
                // mouseEntered : when the mouse enter in component
                System.out.println("Entered!!!");
                label.setIcon(hugFace);
            }

            @Override
            public void mouseExited(MouseEvent e)
            {
                // mouseExited : when the mouse leave component
                System.out.println("Exited!!!");
                label.setIcon(rollingFace);

            }
        });

        frame.setLayout(null);
        frame.add(label);
        frame.setVisible(true);

    }

}