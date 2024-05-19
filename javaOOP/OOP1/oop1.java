public class oop1
{
    public static void main(String[] args)
    {
        student got = new student("got", 6613273, 167.3);

        String a = "a";
        String b = new String();
        // b = "b";

        System.out.println(a);
        System.out.println(b);
        System.out.println(got);

        student.displayInfo1();
    }
}