import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import javax.sound.sampled.*;

public class MyAudio
{
    public static void main(String args[]) throws IOException, LineUnavailableException, UnsupportedAudioFileException
    {
        Scanner scanner = new Scanner(System.in);
        File file = new File("sound.wav");
        AudioInputStream audioStream = AudioSystem.getAudioInputStream(file);
        Clip clip = AudioSystem.getClip();
        clip.open(audioStream);
        int loop = 1;

        while (loop == 1)
        {
            System.out.println("p : Play, s : Stop, r : Reset, q : Quit");
            String input = scanner.nextLine();
            switch(input)
            {
                case ("p") : clip.start(); break;
                case ("s") : clip.stop(); break;
                case ("r") : clip.setMicrosecondPosition(0); break;
                case ("q") : clip.close(); loop = 0; break;
                default : System.out.println("Error : Input not valid");
            }
        }
    }
}