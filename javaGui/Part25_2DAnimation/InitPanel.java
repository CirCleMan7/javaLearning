import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.io.*;

public class InitPanel extends JPanel
{
    final int PANEL_WIDTH = 1000;
    final int PANEL_HEIGHT = 445;
    Image bossImage;
    Image background;
    Image hellBackground;
    Timer timer;
    int velocityX = 4;
    int velocityY = 10;
    int x = 0;
    int y = 0;

    InitPanel()
    {
        this.setPreferredSize(new Dimension(PANEL_WIDTH, PANEL_HEIGHT));
        this.setBackground(Color.black);
        bossImage = new ImageIcon("boss.jpg.png").getImage();
        hellBackground = new ImageIcon("hellBackground.jpeg").getImage();
        timer = new Timer(10, e -> {
            if (x >= PANEL_WIDTH - bossImage.getWidth(null) || x < 0)
            {
                velocityX *= -1;
            }

            if (y >= PANEL_HEIGHT - bossImage.getHeight(null) || y < 0)
            {
                velocityY *= -1;
            }

            x += velocityX;
            y += velocityY;
            repaint();
        });

        timer.start();
    }

    public void paint(Graphics g)
    {
        super.paint(g);

        Graphics2D g2D = (Graphics2D) g;

        g2D.drawImage(hellBackground, 0, 0, null);
        g2D.drawImage(bossImage, x, y, null);
    }
}