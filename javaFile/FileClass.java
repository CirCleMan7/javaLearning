import java.io.File;
import java.io.IOException;

public class FileClass
{
    public static void main(String[] args)
    {
        File file = new File("eiei.txt");

        try
        {
            if (file.exists())
            {
                System.out.println("File is exists");
                System.out.println(file.canRead());
                System.out.println(file.canWrite());
                System.out.println(file.getPath());
                System.out.println(file.getAbsolutePath());
                System.out.println(file.isFile());
                file.delete();   
            }
            else
            {
                file.createNewFile();
                file.mkdir();
                System.out.println("File doesn't exists");
            }
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }
}