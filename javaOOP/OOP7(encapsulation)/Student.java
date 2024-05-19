public class Student
{
    private String name;
    private int id;
    private int score;

    Student(String n, int id, int score)
    {
        this.name = n;
        this.id = id;
        this.score = score;
    }

    public void setScore(int score)
    {
        this.score =  score;
    }

    public String getName()
    {
        return name;
    }

    public int getid()
    {
        return id;
    }

    public int getScore()
    {
        return score;
    }

    public void displayInfo()
    {
        System.out.println("Name : " + name);
        System.out.println("ID : " + id);
        System.out.println("Score : " + score);
    }
}