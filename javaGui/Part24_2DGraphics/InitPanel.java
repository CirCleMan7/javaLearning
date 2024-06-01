import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.io.*;

public class InitPanel extends JPanel
{
    Image image = new ImageIcon("PacmanBackground.png").getImage();

    InitPanel()
    {
        this.setPreferredSize(new Dimension(100, 100));
    }

    public void paint(Graphics g)
    {
        Graphics2D g2D = (Graphics2D) g;

        g2D.setPaint(Color.blue); // set a color of line
        g2D.setStroke(new BasicStroke(5)); // set a thick of line
        // g2D.drawLine(0, 0, 10, 30); // draw a slop line on panel : drawLine(origin x, origin y, width, height)

        g2D.setPaint(Color.red);
        // g2D.drawRect(0, 0, 100, 200); // draw a line of rectangle on panel : drawRect(origin x, origin y, width, height)
        // g2D.fillRect(0, 0, 100, 200); // draw a rectangle on panel : fillRect(origin x, origin, y, width, height)

        g2D.setPaint(Color.orange);
        // g2D.drawOval(0, 0, 100, 100); // draw a line of Oval on panel : drawOval(origin x, origin y, width, height)
        // g2D.fillOval(0, 0, 100, 100); // draw a Oval on panel : fillOval(origin x, origin y, width, height)

        // g2D.drawArc(0, 0, 100, 100, 0, 180); // draw a line that can adjust arc(ส่วนโค้ง) : drawArc(origin x, origin y, width, height, startAngle, arcAngle)
        // g2D.fillArc(0, 0, 100, 100, 0, 180); // draw a shape that can adjust arc(ส่วนโค้ง) : drawArc(origin x, origin y, width, height, startAngle, arcAngle)

        int[] xPoints = {150, 250, 350, 450};
        int[] yPoints = {150, 300, 150, 300};
        // g2D.drawPolygon(xPoints, yPoints, 4); // draw a polygon line : drawPolygon(int[] point x, int[] point y, number of angle)      

        // g2D.setPaint(Color.black);
        // g2D.drawString("I'm learning about JAVAAAA!!!", 50, 20); // to write a string on gui : drawString(text, origin x, origin y)

        g2D.drawImage(image, 0, 0, null); // draw image on panel : drawImage(Class Image, origin x, origin y, Class ImageObserver(usually is null))

    }
}