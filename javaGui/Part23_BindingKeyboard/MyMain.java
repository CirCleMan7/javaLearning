import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.io.*;

public class MyMain
{

    static InitFrame frame;

    static JLabel label;

    static Action upAction;
    static Action downAction;
    static Action leftAction;
    static Action rightAction;

    public static void main(String[] args)
    {
        frame = new InitFrame();

        label = new JLabel();
        label.setBounds(0, 0, 100, 100);
        label.setBackground(Color.red);
        label.setOpaque(true);

        upAction = new UpAction();
        downAction = new DownAction();
        leftAction = new LeftAction();
        rightAction = new RightAction();

        label.getInputMap().put(KeyStroke.getKeyStroke("UP"), "upAction"); // assign when use arrow up need to do "upAction"
        label.getActionMap().put("upAction", upAction); // assign "upAction" to do upAction
        label.getInputMap().put(KeyStroke.getKeyStroke("DOWN"), "downAction");
        label.getActionMap().put("downAction", downAction);
        label.getInputMap().put(KeyStroke.getKeyStroke("LEFT"), "leftAction");
        label.getActionMap().put("leftAction", leftAction);
        label.getInputMap().put(KeyStroke.getKeyStroke("RIGHT"), "rightAction");
        label.getActionMap().put("rightAction", rightAction);

        frame.setLayout(null);
        frame.add(label);
        frame.setVisible(true);

    }

    public static class UpAction extends AbstractAction
    {
        @Override
        public void actionPerformed(ActionEvent e)
        {
            label.setLocation(label.getX(), label.getY() - 10);
        }
    }

    public static class DownAction extends AbstractAction
    {
        @Override
        public void actionPerformed(ActionEvent e)
        {
            label.setLocation(label.getX(), label.getY() + 10);
        }
    }

    public static class LeftAction extends AbstractAction
    {
        @Override
        public void actionPerformed(ActionEvent e)
        {
            label.setLocation(label.getX() - 10, label.getY());
        }
    }

    public static class RightAction extends AbstractAction
    {
        @Override
        public void actionPerformed(ActionEvent e)
        {
            label.setLocation(label.getX() + 10, label.getY());
        }
    }

}