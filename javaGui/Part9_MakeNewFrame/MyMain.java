import javax.swing.*;
import java.awt.*;

class NewWindow extends JFrame
{
    NewWindow()
    {
        JLabel label = new JLabel("Hello World");

        this.setSize(600, 600);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.add(label);
        this.setVisible(true);

    }
}

public class MyMain
{
    public static void main(String[] args)
    {
        JButton button = new JButton("new Window");

        button.addActionListener( e -> {
            NewWindow newWindow = new NewWindow();
            });
        
        InitFrame frame = new InitFrame();

        frame.add(button);
        frame.setVisible(true);
    }
}