public abstract class vehicle
{
    int wheels;

    vehicle(int wheels)
    {
        this.wheels = wheels;
    }

    abstract void run();
    public void say()
    {
        System.out.println("Do you want to race with me?");
        System.out.println("I have " + wheels + " wheels");
    }
}