import javax.swing.*;
import javax.swing.event.*;
import java.awt.event.*;
import java.awt.*;
import java.io.*;

public class MyMain
{

    public static void main(String[] args)
    {
        InitFrame frame = new InitFrame();

        JButton button = new JButton("Select File");
        button.addActionListener(e -> {
            JFileChooser fileChooser = new JFileChooser();

            int response = fileChooser.showSaveDialog(null); // select a file for save
            // int response = fileChooser.showOpenDialog(null); // select a file for open

            if (response == JFileChooser.APPROVE_OPTION)
            {
                File file = new File(fileChooser.getSelectedFile().getAbsolutePath()); // get a file path that user selected
                System.out.println(file);
            }
        });
        
        frame.add(button);
        frame.pack();
        frame.setVisible(true);

    }

}