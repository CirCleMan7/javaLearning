import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.io.*;


public class InitFrame extends JFrame implements KeyListener
{
    JLabel label1 = new JLabel();
    JLabel label2 = new JLabel();

    InitFrame()
    {
        ImageIcon image1 = new ImageIcon("RocketRedIcon.jpeg");
        ImageIcon image2 = new ImageIcon("RocketBlueIcon.png");

        label1.setBounds(0, 0, 100, 100);
        // label1.setBackground(Color.red);
        // label1.setOpaque(true);
        label1.setIcon(image1);

        label2.setBounds(100, 100, 100, 100);
        // label2.setBackground(Color.blue);
        // label2.setOpaque(true);
        label2.setIcon(image2);

        this.getContentPane().setBackground(Color.black); // set frame blackground color
        this.setLayout(null);
        this.add(label1);
        this.add(label2);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(600,600);
        this.addKeyListener(this);
        this.setVisible(true);
    }

    @Override
    public void keyTyped(KeyEvent e)
    {
        // KeyTyped : active when use pressed char on keyboard
        switch (e.getKeyChar())
        {
            case 'a' : label1.setLocation(label1.getX() - 15, label1.getY()); break;
            case 'w' : label1.setLocation(label1.getX(), label1.getY() - 15); break;
            case 's' : label1.setLocation(label1.getX(), label1.getY() + 15); break;
            case 'd' : label1.setLocation(label1.getX() + 15, label1.getY()); break;
        }   
        
    }

    @Override
    public void keyPressed(KeyEvent e)
    {
        // ArrowKeyCode :
        // 37 : ArrowLeft
        // 38 : ArrowUp
        // 40 : ArrowDown
        // 39 : ArrowRight

        // keyPressed : active when press any key on keyboard

        switch (e.getKeyCode())
        {
            case 37 : label2.setLocation(label2.getX() - 10, label2.getY()); break;
            case 38 : label2.setLocation(label2.getX(), label2.getY() - 10); break;
            case 40 : label2.setLocation(label2.getX(), label2.getY() + 10); break;
            case 39 : label2.setLocation(label2.getX() + 10, label2.getY()); break;
        }   
    }

    @Override
    public void keyReleased(KeyEvent e)
    {
        // keyReleased = function will active when key have been released

        // System.out.println("You're released key char : " + e.getKeyChar());
        System.out.println("You're released key code : " + e.getKeyCode());
        
    }
}

// frame.addKeyListener(new KeyAdapter() {
//             @Override
//             public void keyPressed(KeyEvent e) {
//                 System.out.println("Key Pressed: " + KeyEvent.getKeyText(e.getKeyCode()));
//             }

//             @Override
//             public void keyReleased(KeyEvent e) {
//                 System.out.println("Key Released: " + KeyEvent.getKeyText(e.getKeyCode()));
//             }
//         });