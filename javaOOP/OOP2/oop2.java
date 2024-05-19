public class oop2
{
    public static void main(String[] args)
    {


        student got = new student();
        student ball = new student();
        student neo = new student();
        student jj = new student();

        /*
            if we use System.out.print(got) it will print address by auto change to System.out.print(got.toString()).
            So that also mean we can change a output of toString() to do anything we want
        */

    //    System.out.println(student.amount);
    got.displayInfo1();

    }
}