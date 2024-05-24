import javax.swing.JFrame;
import javax.swing.ImageIcon;
import java.awt.Color;

public class MyFrame extends JFrame
{
    MyFrame()
    {
        JFrame frame = new JFrame(); // create frame
        this.setTitle("Mario"); // set name of title
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // set button on app to do (EXIT_ON_CLOSE = close program, HIDE_ON_CLOSE = hide program, DO_NOTHING_ON_CLOSE = do nothing)
        this.setSize(720,720); // set x,y dimension
        this.setResizable(false); // prevent resize by user
        this.setVisible(true); // make it visible


        ImageIcon icon = new ImageIcon("MarioIcon.png"); // create Icon
        this.setIconImage(icon.getImage()); // set icon
        this.getContentPane().setBackground(new Color(255,0,0)); // can use Color.green or hex num of color

    }
}