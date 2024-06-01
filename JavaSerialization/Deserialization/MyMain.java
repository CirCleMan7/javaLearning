import java.io.Serializable;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.IOException;
import java.io.ObjectStreamClass;

class User implements Serializable
{
    String id;
    String password;
    transient int a; // transient : to ignore this value when write in serialize

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
    public static void main(String[] args) throws IOException, ClassNotFoundException
    {
        // Step to Deserialize
        // -------------------------------------------------------------------------
        // 1. Declare your object but now instantiate
        // 2. Your class implements Serializable
        // 3. add import java.io.Serializable
        //        import java.io.FileOutputStream;
        //        import java.io.ObjectOutputStream;
        // 4. FileInputStream fileIn = new FileInputStream(file path)
        // 5. ObjectInputStream in = new ObjectInputStream(fileIn)
        // 6. "ObjectName" = ("Class name") in.readObject();
        // 7. in.close(); fileIn.close();
        // -------------------------------------------------------------------------

        User user1 = null;
        User user2 = null;

        FileInputStream fileIn = new FileInputStream("../User.ser");
        ObjectInputStream in = new ObjectInputStream(fileIn);


        user1 = (User) in.readObject();
        user2 = (User) in.readObject();


        in.close();
        fileIn.close();

        user1.info();
        user2.info();

        long serialVersionUID1 = ObjectStreamClass.lookup(user1.getClass()).getSerialVersionUID();
        System.out.println(serialVersionUID1);
        long serialVersionUID2 = ObjectStreamClass.lookup(user2.getClass()).getSerialVersionUID();
        System.out.println(serialVersionUID2);
    }
}