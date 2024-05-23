public interface muStudent
{
    // int ID;
    void showID();
    default void say()
    {
        System.out.println("Hello");
    }
}