public class car extends vehicle
{
    int velocity;

    car(int v)
    {
        velocity = v;
    }

    @Override
    void run()
    {
        System.out.println("This car is running " + velocity + " km/hr");        
    }
}