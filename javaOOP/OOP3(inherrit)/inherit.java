public class inherit
{
    public static void main(String[] args)
    {
        bicycle bicycle1 = new bicycle(2);
        car car1 = new car(4);

        bicycle1.run();
        car1.run();
        car1.stop();
        bicycle1.stop();

        System.out.println("bicycle wheel = " + bicycle1.wheel);
        System.out.println("car door = " + car1.door);
    }
}