import javax.swing.*;
import java.awt.*;

public class MyMain
{
    public static void main(String[] args)
    {
        InitFrame frame = new InitFrame();

        frame.setLayout(new FlowLayout()); // set layout to be FlowLayout(adjust, margin x, margin y)
                                           // adjust :
                                           // FlowLayout.LEADING = stick at left corner
                                           // FlowLayout.CENTER = stick at middle
                                           // FlowLayout.TRAILING = stick at right corner

        JPanel panel = new JPanel();
        panel.setPreferredSize(new Dimension(300, 400));
        panel.setBackground(Color.blue);
        panel.setLayout(new FlowLayout());


        panel.add(new JButton("1"));
        panel.add(new JButton("2"));
        panel.add(new JButton("3"));
        panel.add(new JButton("4"));
        panel.add(new JButton("5"));
        panel.add(new JButton("6"));
        panel.add(new JButton("7"));
        panel.add(new JButton("8"));
        panel.add(new JButton("9"));

        // frame.add(new JButton("1"));
        // frame.add(new JButton("2"));
        // frame.add(new JButton("3"));
        // frame.add(new JButton("4"));
        // frame.add(new JButton("5"));
        // frame.add(new JButton("6"));
        // frame.add(new JButton("7"));
        // frame.add(new JButton("8"));
        // frame.add(new JButton("9"));
        
        frame.add(panel);
        frame.setVisible(true);
    }
}