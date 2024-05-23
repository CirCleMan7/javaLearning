public class abstraction
{
    public static void main(String[] args)
    {
        vehicle car1 = new car(10, 4);
        car car2 = new car(5, 3);

        car1.run();
        car1.say();

        car2.run();
        car2.say();
    }
}