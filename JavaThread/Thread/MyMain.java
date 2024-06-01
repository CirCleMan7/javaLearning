class MyThread extends Thread
{
    @Override
    public void run()
    {
        if (this.isDaemon())
            System.out.println("My daemon thread is running");
        else
            System.out.println("My thread is running");
    }
}

public class MyMain
{
    public static void main(String[] args) throws InterruptedException
    {
        System.out.println(Thread.activeCount()); // to check how many thread running

        Thread.currentThread().setName("Mainnn"); // to change a name of thread

        System.out.println(Thread.currentThread().getName()); // to check name of thread

        Thread.currentThread().setPriority(7); // to set a priority 

        System.out.println(Thread.currentThread().getPriority()); // to get a priority thread

        System.out.println(Thread.currentThread().isAlive()); // to check that thread is running or not

        // for (int i = 3; i > 0; i--)
        // {
        //     System.out.println(i);
        //     Thread.sleep(1000);
        // }

        // System.out.println("Loading complete");

        MyThread thread2 = new MyThread();
        thread2.setDaemon(true);
        thread2.start(); 

        System.out.println(thread2.isAlive());
    }
}