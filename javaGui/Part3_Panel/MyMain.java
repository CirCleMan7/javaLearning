import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.Font;
import javax.swing.BorderFactory;
import javax.swing.border.Border;
import javax.swing.JPanel;
import java.awt.*;

public class MyMain
{
    public static void main(String[] args)
    {
        InitFrame frame = new InitFrame();

        ImageIcon emoji = new ImageIcon("emojiresize.png");

        JLabel label = new JLabel();
        label.setText("Hello");
        label.setIcon(emoji);
        // label.setVerticalAlignment(JLabel.CENTER);
        // label.setHorizontalAlignment(JLabel.CENTER);
        label.setBounds(30, 30, 75, 75);

        
        // label.setVerticalAlignment(JLabel.CENTER);
        
        JPanel redPanel = new JPanel();
        redPanel.setBackground(Color.red);
        redPanel.setBounds(0, 0, 300, 300);
        redPanel.setLayout(null);

        JPanel bluePanel = new JPanel();
        bluePanel.setBackground(Color.blue);
        bluePanel.setBounds(0, 300, 150, 150);

        JPanel greenPanel = new JPanel();
        greenPanel.setBackground(Color.green);
        greenPanel.setBounds(300, 0, 150, 150);

        frame.setLayout(null);
        redPanel.add(label);
        frame.add(redPanel);
        frame.add(bluePanel);
        frame.add(greenPanel);
        frame.setVisible(true);


    }
}