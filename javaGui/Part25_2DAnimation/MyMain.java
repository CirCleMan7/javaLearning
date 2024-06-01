import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.io.*;

public class MyMain
{
    public static void main(String[] args)
    {
        InitFrame frame = new InitFrame();

        InitPanel panel = new InitPanel();

        frame.add(panel);
        // frame.setLocationRelativeTo(null);
        // frame.pack();
        frame.setVisible(true);


    }
}