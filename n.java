interface Test
{
    void say();
}

public class n
{
    public static void main(String[] args)
    {
        Test test = () -> System.out.println("Hello World");

        test.say();
    }
}