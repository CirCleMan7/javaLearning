public class animal
{
    int leg;

    animal(int l)
    {
        leg = l;
    }

    void hello()
    {
        System.out.println("animal says hellooo");
    }

    void myLeg()
    {
        System.out.println("I have " + leg + " leg");
    }
}