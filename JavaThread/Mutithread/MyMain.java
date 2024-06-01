class MyThread2 implements Runnable
{
    @Override
    public void run()
    {
        for (int i = 0; i < 10; i++)
        {
            System.out.println("Thread 2 = " + i);
            try{
                Thread.sleep(1000);
            }
            catch (InterruptedException e)
            {
                e.printStackTrace();
            }
        }
        System.out.println("Thread 2 Doneee :)");
    }
}

class MyThread1 extends Thread
{
    @Override
    public void run()
    {
        for (int i = 0; i < 10; i++)
        {
            System.out.println("Thread 1 = " + i);
            try{
                Thread.sleep(1000);
            }
            catch (InterruptedException e)
            {
                e.printStackTrace();
            }
        }
        System.out.println("Thread 1 Doneee :)");
    }
}

public class MyMain
{
    public static void main(String[] args) throws InterruptedException
    {
        MyThread1 thread1 = new MyThread1();

        Thread thread2 = new Thread(new MyThread2());

        thread1.start();
        thread1.join(3000); // wait for thread1 stop running and will do another thing or wait until : Thread.join(wait X millisecond); if not input will wait until stop running
        thread2.start();
    }
}