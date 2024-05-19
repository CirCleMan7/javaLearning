public class Encapsulation
{
    public static void main(String[] args)
    {
        Student got = new Student("Sakonkiat", 19, 10);
        
        // System.out.println("Name : " + got.getName());
        got.displayInfo();

        got.setScore(100);

        got.displayInfo();
    }
}