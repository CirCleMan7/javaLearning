import java.io.FileWriter;
import java.io.IOException;

public class MyFileWriter
{
    public static void main(String[] args)
    {
        try
        {
            FileWriter writer = new FileWriter("Cyber.txt");
            writer.write("Hello World\n");
            writer.write("Hello b1\n");
            writer.write("Hello b2\n");
            writer.write("Hello b3\n");
            writer.close();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }
}