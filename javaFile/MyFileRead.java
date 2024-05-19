import java.io.FileReader;
import java.io.IOException;

public class MyFileRead
{
    public static void main(String[] args)
    {
        try
        {
            FileReader reader = new FileReader("Picture.txt");
            int data = reader.read();
            while (data != -1)
            {
                System.out.print((char)data);
                data = reader.read();
            }
            reader.close();
        }
        catch (IOException e)
        {
            System.out.println("Error");
        }
    }
}