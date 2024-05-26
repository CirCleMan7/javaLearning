import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.io.*;


public class InitFrame extends JFrame implements KeyListener
{
    JLabel label = new JLabel();

    InitFrame()
    {

        label.setBounds(0, 0, 100, 100);
        label.setBackground(Color.red);
        label.setOpaque(true);


        this.setLayout(null);
        this.add(label);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(600,600);
        this.addKeyListener(this);
        this.setVisible(true);
    }

    @Override
    public void keyTyped(KeyEvent e)
    {
        // Key
        switch (e.getKeyChar())
        {
            case 'a' : label.setLocation(label.getX() - 1, label.getY());
            case 'w' : label.setLocation(label.getX(), label.getY() + 1);
            case 's' : label.setLocation(label.getX(), label.getY() - 1);
            case 'd' : label.setLocation(label.getX() + 1, label.getY());
        }
    }

    @Override
    public void keyPressed(KeyEvent e)
    {
        
    }

    @Override
    public void keyReleased(KeyEvent e)
    {
        // keyReleased = function will active when key have been released

        System.out.println("You're released key char : " + e.getKeyChar());
        System.out.println("You're released key code : " + e.getKeyCode());
    }
}