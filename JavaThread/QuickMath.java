import java.util.Random;
import java.util.Scanner;

class NewThread extends Thread
{
    @Override
    public void run()
    {
        for (int i = 0; i < 5; i++)
        {
            try{
                // System.out.println(i);
                Thread.sleep(1000);
            }
            catch(InterruptedException e)
            {
                e.printStackTrace();
            }
        }
    }
}

public class QuickMath
{
    public static void main(String[] arg) throws InterruptedException
    {
        int x = 0;
        int y = 0;
        int point = 0;
        int answer = 0;
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        NewThread thread1;

        for (int i = 0; i < 10; i++)
        {
            // System.out.print(thread1.isAlive());
            x = random.nextInt(100) + 1;
            y = random.nextInt(100) + 1;
            System.out.println(x + " + " + y + " : ");
            thread1 = new NewThread();
            thread1.start();
            answer = scanner.nextInt();
            if (thread1.isAlive() == false)
            {
                System.out.println("Timeout +0 point");
            }
            else if (answer == x + y)
            {
                System.out.println("Correct +1 point");
                point += 1;
            }
            else
            {
                System.out.println("Wrong +0 point");
            }
            System.out.println("You score : " + point);
        }
    }
}