import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.io.*;

public class MyMain
{

    public static void main(String[] args)
    {
        InitFrame frame = new InitFrame();
        DragPanel dragPanel = new DragPanel();

        frame.add(dragPanel);
        frame.setVisible(true);

    }

}