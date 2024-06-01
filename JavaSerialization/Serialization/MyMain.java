import java.io.Serializable;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.IOException;

class User implements Serializable
{
    String id;
    String password;
    transient int a;
    

    void career()
    {
        System.out.println("I'm engineer");
    }

    void info()
    {
        System.out.println("ID : " + id);
        System.out.println("Password ; " + password);
    }
}

public class MyMain
{
    public static void main(String[] args) throws IOException
    {
        // Step to serialize
        // -------------------------------------------------------------------------
        // 1. your class to serialize need to implements Serializable interface
        // 2. add import java.io.Serializable
        //        import java.io.FileOutputStream;
        //        import java.io.ObjectOutputStream;
        // 3. FileOutputStream fileOut = new FileOutputStream(File path)
        // 4. ObjectOutputStream out = new ObjectOutputStream(fileout)
        // 5. out.writeObject(objectName)
        // 6. out.close(); fileOut.close();
        // -------------------------------------------------------------------------

        User user1 = new User();
        user1.id = "admin";
        user1.password = "admin";


        User user2 = new User();
        user2.id = "manager";
        user2.password = "manager";


        FileOutputStream fileOut = new FileOutputStream("../User.ser");
        ObjectOutputStream out = new ObjectOutputStream(fileOut);


        out.writeObject(user1);
        out.writeObject(user2);


        out.close();
        fileOut.close();

        System.out.println("Data has been saved");
    }
}