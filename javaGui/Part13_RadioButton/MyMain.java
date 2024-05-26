import javax.swing.*;
import java.awt.*;

public class MyMain
{
    public static void main(String[] args)
    {
        InitFrame frame = new InitFrame();
        frame.setLayout(new FlowLayout());

        ImageIcon minecraftIcon = new ImageIcon("minecraft.png");
        ImageIcon dota2Icon = new ImageIcon("dota2.png");
        ImageIcon terrariaIcon = new ImageIcon("terraria.png");
        
        JRadioButton minecraft = new JRadioButton("Minecraft");
        JRadioButton dota2 = new JRadioButton("DOTA 2");
        JRadioButton terraria = new JRadioButton("Terraria");

        minecraft.setIcon(minecraftIcon);
        dota2.setIcon(dota2Icon);
        terraria.setIcon(terrariaIcon);

        minecraft.addActionListener(e -> {
            System.out.println("You're playing Minecraft");
        });

        dota2.addActionListener(e -> {
            System.out.println("You're playing DOTA 2");
        });

        terraria.addActionListener(e -> {
            System.out.println("You're playing Terraria");
        });
    
        ButtonGroup buttonGroup = new ButtonGroup(); // set minecraft dota2 and terraria button are group together
        buttonGroup.add(minecraft);
        buttonGroup.add(dota2);
        buttonGroup.add(terraria);

        frame.add(minecraft);
        frame.add(dota2);
        frame.add(terraria);
        frame.setVisible(true);
    }
}