import javax.swing.*;
import java.awt.*;

public class MyMain
{
    public static void main(String[] args)
    {
        InitFrame frame = new InitFrame();

        String[] games = {"Halo", "GTA V", "Warcarft"};

        JComboBox comboBox = new JComboBox(games);
        comboBox.addItem("???");
        comboBox.insertItemAt("<'_'>", 3);
        comboBox.setSelectedIndex(2);
        // comboBox.setEditable(true);
        comboBox.removeItem("???");
        comboBox.removeItemAt(3);
        comboBox.insertItemAt("???", 3);
        System.out.println("Item count = " + comboBox.getItemCount());
        comboBox.addActionListener(e -> {
            int select = comboBox.getSelectedIndex();
            if (select == 0)
            {
                System.out.println("You're selecting Halo");
            }
            else if (select == 1)
            {
                System.out.println("You're selecting GTA V");
            }
            else if (select == 2)
            {
                System.out.println("You're selecting Warcraft");
            }
            else
            {
                System.out.println("You're selecting something");
                comboBox.removeAllItems();
            }
        });
        
        frame.add(comboBox);
        frame.pack();
        frame.setVisible(true);

    }
}