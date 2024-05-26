import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.Font;
import javax.swing.BorderFactory;
import javax.swing.border.Border;
import javax.swing.JPanel;
import java.awt.*;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class InitFrame extends JFrame
{
    JButton button;

    InitFrame()
    {
        ImageIcon image = new ImageIcon("emojiresize.png");
        ImageIcon image2 = new ImageIcon("MarioIcon.png");

        JLabel label = new JLabel();
        label.setIcon(image2);
        label.setBounds(50, 400, 600, 300);
        label.setVisible(false);

        button = new JButton();
        button.setBounds(280, 250, 150, 100);
        button.addActionListener(e -> {System.out.println("Hello"); button.setEnabled(false); label.setVisible(true);}); // to add function on button
        button.setText("say Hello"); // set text on button
        button.setFocusable(false); // delete border
        button.setIcon(image);
        button.setHorizontalTextPosition(JButton.CENTER);
        button.setVerticalTextPosition(JButton.BOTTOM);
        button.setFont(new Font("STSong", Font.ITALIC,30)); // set font of text
        // button.setIconTextGap();
        button.setForeground(Color.blue);
        button.setBackground(Color.black);
        button.setOpaque(true);
        button.setBorder(BorderFactory.createEtchedBorder()); // set border
        // button.setEnabled(false); // set button to can press or not

        

        this.add(button);
        this.add(label);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // set button on app to do (EXIT_ON_CLOSE = close program, HIDE_ON_CLOSE = hide program, DO_NOTHING_ON_CLOSE = do nothing)
        this.setSize(600,600); // set x,y dimension
        this.setLayout(null);

        this.setVisible(true);
        // this.setResizable(false); // prevent resize by user
    }

    // @Override
    // public void actionPerformed(ActionEvent e)
    // {
    //     if (e.getSource() == button)
    //     {
    //         System.out.println("Hello World");
    //     }
    // }
}