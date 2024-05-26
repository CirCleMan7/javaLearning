import javax.swing.*;
import javax.swing.event.*;
import java.awt.event.*;
import java.awt.*;

public class MyMain
{

    public static void main(String[] args)
    {
        InitFrame frame = new InitFrame();

        ImageIcon newFileIcon = new ImageIcon("NewFileIcon.png");
        ImageIcon openFileIcon = new ImageIcon("OpenFileIcon.png");
        ImageIcon saveFileIcon = new ImageIcon("SaveFileIcon.png");

        JMenuBar menuBar = new JMenuBar();

        JMenu fileMenu = new JMenu("File");
        JMenu editMenu = new JMenu("Edit");
        JMenu helpMenu = new JMenu("Help");

        JMenuItem newFile = new JMenuItem("New file...");
        JMenuItem openFile = new JMenuItem("Open...");
        JMenuItem saveFile = new JMenuItem("Save");

        newFile.setIcon(newFileIcon);
        openFile.setIcon(openFileIcon);
        saveFile.setIcon(saveFileIcon);

        newFile.addActionListener(e -> {
            System.out.println("'Pip Pip Pip' new file");
        });

        openFile.addActionListener(e -> {
            System.out.println("'Pip Pip Pip' open file");
        });

        saveFile.addActionListener(e -> {
            System.out.println("'Pip Pip Pip' save file");
        });

        // <---- set shortcut on keybroad ---->

        fileMenu.setMnemonic(KeyEvent.VK_F); // press alt + f to FileMenu in window | in mac press control + option + f
        editMenu.setMnemonic(KeyEvent.VK_E); // press alt + e to EditMenu in window | in mac press control + option + e
        helpMenu.setMnemonic(KeyEvent.VK_H); // press alt + h to HelpMenu in window | in mac press control + option + h

        newFile.setMnemonic(KeyEvent.VK_N); // press n for NewFile
        openFile.setMnemonic(KeyEvent.VK_O); // press o for OpenFile
        saveFile.setMnemonic(KeyEvent.VK_S); // press e for SaveFile

        // <---- set shortcut on keybroad ---->

        fileMenu.add(newFile);
        fileMenu.add(openFile);
        fileMenu.add(saveFile);

        menuBar.add(fileMenu);
        menuBar.add(editMenu);
        menuBar.add(helpMenu);

        frame.setJMenuBar(menuBar);

        frame.setVisible(true);

    }

}