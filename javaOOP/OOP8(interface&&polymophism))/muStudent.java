public interface muStudent
{
    // int ID;

    void test(int x);
    void showID();
    default void say()
    {
        System.out.println("Hello");
    }
}