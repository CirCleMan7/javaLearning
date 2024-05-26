import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;

public class MyMain
{
    public static void main(String[] args)
    {
        InitFrame frame = new InitFrame();

        JPanel panel = new JPanel();
        JLabel label = new JLabel();

        JSlider slider = new JSlider();
        slider.setPreferredSize(new Dimension(150, 300));
        
        slider.setPaintTicks(false); // set line to be visible on slidebar
        slider.setMinorTickSpacing(10); // set line that measure slidebar

        slider.setPaintTrack(true); // set a bar to be visible on slidebar
        slider.setMajorTickSpacing(25); // set a big line that measure slidebar
    
        slider.setPaintLabels(true); // show a number in each line on slidebar
        // slider.setFont()

        slider.setOrientation(SwingConstants.VERTICAL); // to set bar to be vertical on horizontal
        // slider.setOrientation(SwingCostants.HORIZONTAL);
        
        label.setText("'C = " + slider.getValue());

        slider.addChangeListener(e -> {                 // for add function that do when slide a sliderbar
            label.setText("'C = " + slider.getValue()); // that function is ( public void stateChanged(ChangeEvent e) )
        });

        panel.add(slider);
        panel.add(label);

        frame.add(panel);
        frame.pack();
        frame.setVisible(true);

    }
}