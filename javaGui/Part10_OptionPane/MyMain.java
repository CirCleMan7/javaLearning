import javax.swing.*;
import java.awt.*;

public class MyMain
{
    public static void main(String[] args)
    {
        // JOptionPane = for pop up a dialog to user
        // JOptionPane.showMessageDialog(Component, Object, String, int)
        // parameter :
        // Component – The first parameter is a component which determines the Frame in which the dialog is displayed; if null, or if the parentComponent has no Frame, a default Frame is used.
        // Object – The second parameter can be any objects. (In some older versions of Java you might get a compiler error when using primitive types directly).
        // String – The third parameter is a String placed as the title of the message dialog window.
        // int – The int that follows the String is the MessageType. The different MessageTypes for JOptionPane, are:
        // ERROR_MESSAGE
        // INFORMATION_MESSAGE
        // WARNING_MESSAGE
        // QUESTION_MESSAGE
        // PLAIN_MESSAGE
        // Icon – The last parameter is an Icon that is displayed inside the dialog and overrides the default 



        // JOptionPane.showMessageDialog(null, "This is some information", "Admin", JOptionPane.PLAIN_MESSAGE);
        // JOptionPane.showMessageDialog(null, "This is useless information", "Admin", JOptionPane.INFORMATION_MESSAGE);
        // JOptionPane.showMessageDialog(null, "Plese don't close me", "Admin", JOptionPane.WARNING_MESSAGE);
        // JOptionPane.showMessageDialog(null, "Can you say it again?", "Admin", JOptionPane.QUESTION_MESSAGE);
        // JOptionPane.showMessageDialog(null, "Something error", "Admin", JOptionPane.ERROR_MESSAGE);


        // <----------- showConfirmDialog --------->

        // showConfirmDialog(Component, Object, String, int, int, Icon)
        // 1. Component – The first parameter is a Component which determines the Frame in which the dialog is displayed; if null, or if the parentComponent has no Frame, a default Frame is used.
        // 2. Object – The second parameter can be any Object. (In some older versions of Java you might get a compiler error when using primitive types directly)
        // 3. String – The third parameter is a String placed as the title of the confirmDialog window.
        // 4. int – The int that follows the String is the OptionType. The different OptionTypes for JOptionPane, are:
        // DEFAULT_OPTION
        // YES_NO_OPTION
        // YES_NO_CANCEL_OPTION
        // OK_CANCEL_OPTION
        // 5. int – The next int is the MessageType. The different MessageTypes for JOptionPane, are:
        // ERROR_MESSAGE
        // INFORMATION_MESSAGE
        // WARNING_MESSAGE
        // QUESTION_MESSAGE
        // PLAIN_MESSAGE
        // 6. Icon – The last parameter is an Icon that is displayed inside the dialog and overrides the default MessageType icon.

        int answer = JOptionPane.showConfirmDialog(null, "Do you want to delete it?", "Admin", JOptionPane.YES_NO_CANCEL_OPTION);
        ImageIcon image = new ImageIcon("emojiresize.png");
        String[] responses = {"Okayyy yesss", "Hell nahh", "Question again"};

        while (true)
        {
            if (answer == 0)
            {
                JOptionPane.showMessageDialog(null, "Information deleted", "admin", JOptionPane.QUESTION_MESSAGE);
                break;
            }
            else if (answer == 1 || answer == 2)
            {
                JOptionPane.showMessageDialog(null, "why not?", "admin", JOptionPane.QUESTION_MESSAGE);
                break;
            }
            else
            {
                answer = JOptionPane.showOptionDialog(null, "answer me pleaseee", "Admin", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, image, responses, null);
            }
        }

    }
}