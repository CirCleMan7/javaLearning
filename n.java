interface Test
{
    void say();
}

class Student
{
    String name;
    int id;
}

public class n
{
    public static void main(String[] args)
    {
        Test test = () -> System.out.println("Hello World");
        // n1 n = new n1();
        NoMember e = new NoMember();

        Student got = new Student();

        got.name = "Sakonkiat";

        System.out.println(got.name);

        // n.a = 4;
        // e.a = 5;

        // System.out.println(n.a);
        // System.out.println(e.a);
        test.say();
    }
}