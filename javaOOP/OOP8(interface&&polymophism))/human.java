public class human implements muStudent, thaiPerson
{
    String name;
    int ID;

    human()
    {
        this.name = "NoName";
        this.ID = 123456;
    }

    human(String name)
    {
        this.name = name;
        this.ID = 123456;
    }

    @Override
    public void showID()
    {
        System.out.println("This is my ID : " + ID);
    }

    @Override
    public void showName()
    {
        System.out.println("This is my Name : " + name);
    }
}