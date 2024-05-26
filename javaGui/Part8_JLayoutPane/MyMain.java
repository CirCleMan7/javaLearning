import javax.swing.*;
import java.awt.*;

public class MyMain
{
    public static void main(String[] args)
    {
        InitFrame frame = new InitFrame();
    
        JLabel label1 = new JLabel();
        label1.setBackground(Color.red);
        label1.setOpaque(true);
        label1.setBounds(100, 100, 100, 100);

        JLabel label2 = new JLabel();
        label2.setBackground(Color.green);
        label2.setOpaque(true);
        label2.setBounds(120, 120, 100, 100);

        JLabel label3 = new JLabel();
        label3.setBackground(Color.blue);
        label3.setOpaque(true);
        label3.setBounds(140, 140, 100, 100);
        
        JLayeredPane layeredPane = new JLayeredPane(); // make JLayeredPane that can make a dimension of label
                                                       // JLayeredPane()
                                                       // layeredpane.add(label, adjust)
                                                       // adjust :
                                                       // add(label, JLayeredPane.DEFAULT_LAYER)
                                                       // add(label, JLayeredPane.PALETTE_LAYER)
                                                       // add(label, JLayeredPane.MODAL_LAYER)
                                                       // add(label, JLayeredPane.POPUP_LAYER)
                                                       // add(label, JLayeredPane.DRAG_LAYER)
                                                       // or 
                                                       // add(label, indexZ)
                                                       // example :
                                                       // add(label, Integer.valueof(0))
                                                       
        layeredPane.setBounds(0, 0, 1000, 1000);
        layeredPane.add(label1, Integer.valueOf(0));
        layeredPane.add(label2, Integer.valueOf(2));
        layeredPane.add(label3, Integer.valueOf(1));

        frame.setLayout(null);
        frame.add(layeredPane);
        frame.setVisible(true);
    }
}