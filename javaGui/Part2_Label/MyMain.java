import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.Font;
import javax.swing.BorderFactory;
import javax.swing.border.Border;

public class MyMain
{
    public static void main(String[] args)
    {
        InitFrame frame = new InitFrame();

        Border border = BorderFactory.createLineBorder(Color.red, 3);
        JLabel label = new JLabel();
        ImageIcon image = new ImageIcon("MarioIcon.png");
        label.setText("Hello there"); // to set text on label
        label.setIcon(image); // to set image on label
        label.setHorizontalTextPosition(JLabel.CENTER); // to set LEFT, CENTER, RIGHT of ImageIcon
        label.setVerticalTextPosition(JLabel.TOP); // to set TOP, CENTER, BOTTOM of ImageIcon
        label.setForeground(Color.white); // set font color
        label.setFont(new Font("STSong", Font.ITALIC,30)); // set font of text
        label.setIconTextGap(-100); // set gap between image and text
        label.setBackground(Color.black); // set background color
        label.setOpaque(true); // display background color
        label.setBorder(border); // set border
        label.setVerticalAlignment(JLabel.CENTER); // set vertical position of label
        label.setHorizontalAlignment(JLabel.CENTER); // set horizontal position of label

        // label.setBounds(100, 150, 150, 150); // set position and size of label (x, y, width, height)


        // frame.setLayout(null); // set frame to be layout 
        frame.add(label); // to add label on frame
        frame.setVisible(true); // make sure this under everything if not it will able to see that thing

        frame.pack(); // set frame size = label size
        


    }
}