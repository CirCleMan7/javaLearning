public class method
{
    static void hello(String name)
    {
        System.out.println("Hello " + name);
    }

    public static int sum(int x, int y)
    {
        int z = 0;
        z += x + y;
        return z;
    }

    public static void main(String[] args)
    {
        hello("got");
        sum(2, 5);
        sum(2, 5);
        int ans = sum(2, 5);
        System.out.println(ans);
    }
}
