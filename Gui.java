import javax.swing.JOptionPane;

public class Gui
{
    public static void main(String[] args)
    {
        String name = JOptionPane.showInputDialog("Enter your name");

        JOptionPane.showMessageDialog(null, "Hello " + name);

        int age = Integer.parseInt(JOptionPane.showInputDialog("Enter your age"));

        double weight = Double.parseDouble(JOptionPane.showInputDialog("Enter your weight"));

        double height = Double.parseDouble(JOptionPane.showInputDialog("Enter your height"));

        JOptionPane.showMessageDialog(null, "Personal info :\nName : " + name + "\nwegiht : " + weight + "\nhegiht : " + height);

        scanner.close();
    }
}