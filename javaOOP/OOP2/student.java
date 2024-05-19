public class student
{
    String name;
    int id;
    double height;
    static int amount;

    student()
    {
        amount++;
    }

    student(String name)
    {
        this.name = name;
        amount++;
    }

    student(String name, int id)
    {
        this.name = name;
        this.id = id;
        amount++;
    }

    student(String name, int id, double height)
    {
        this.name = name;
        this.id = id;
        this.height = height;
        amount++;
    }

    static void displayInfo1()
    {
        System.out.println("We have " + amount + " students");
    }
    
    public String toString()
    {
        return "Name : " + this.name + "\nID : " + this.id + "\nHeight : " + this.height;
    }

}