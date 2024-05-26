import javax.swing.JFrame;
import javax.swing.ImageIcon;
import java.awt.Color;

public class InitFrame extends JFrame
{
    InitFrame()
    {
        
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // set button on app to do (EXIT_ON_CLOSE = close program, HIDE_ON_CLOSE = hide program, DO_NOTHING_ON_CLOSE = do nothing)
        this.setSize(600,600); // set x,y dimension
        // this.setResizable(false); // prevent resize by user
    }
}