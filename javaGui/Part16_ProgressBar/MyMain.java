import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;

public class MyMain
{
    static JProgressBar bar = new JProgressBar(); // JProgressBar(min value, max value)
    static InitFrame frame = new InitFrame();

    public static void main(String[] args)
    {

        bar.setValue(0); // set initial value of bar
        bar.setPreferredSize(new Dimension(300, 300));
        bar.setStringPainted(true); // show a percent of bar
        bar.setBackground(Color.black);
        bar.setForeground(Color.green);


        frame.setLayout(new FlowLayout());
        frame.add(bar);
        frame.pack();
        frame.setVisible(true);

        fill();
    }

    public static void fill()
    {
        int progress = 0;

        while (progress <= 100)
        {
            bar.setValue(progress);
            try
            {
                Thread.sleep(1000);
            }
            catch (InterruptedException e)
            {
                e.printStackTrace();
            }
            progress += 20;
        }

        bar.setString("Done :)"); // set text on progress bar
        JOptionPane.showMessageDialog(null, "Loading complete", "Admin", JOptionPane.PLAIN_MESSAGE);

    }
}