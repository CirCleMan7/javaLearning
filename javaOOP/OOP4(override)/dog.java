public class dog extends animal
{

    dog(int leg)
    {
        super(leg);
    }

    @Override
    void hello()
    {
        super.hello();
        System.out.println("dog speak helloooo");
    }
    void Hello()
    {
        super.hello();
        System.out.println("dog speak honk honk");
    }
}