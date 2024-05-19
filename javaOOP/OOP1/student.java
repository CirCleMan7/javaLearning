public class student
{
    String name;
    int id;
    double height;

    student()
    {
    }

    student(String name)
    {
        this.name = name;
    }

    student(String name, int id)
    {
        this.name = name;
        this.id = id;
    }

    student(String name, int id, double height)
    {
        this.name = name;
        this.id = id;
        this.height = height;
    }

    static void displayInfo1()
    {
        System.out.println("eiei");
    }
    
    void displayInfo()
    {
        System.out.println(this.name);
        System.out.println(this.id);
        System.out.println(this.height);
    }

}