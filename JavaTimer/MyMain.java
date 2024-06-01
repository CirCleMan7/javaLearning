import java.util.TimerTask;
import java.util.Timer;
import java.util.Calendar;

public class MyMain
{
    public static void main(String[] args)
    {
        Timer timer = new Timer();

        TimerTask task = new TimerTask()
        {
            @Override
            public void run()
            {
                System.out.println("Hello");
            }
        };

        Calendar date = Calendar.getInstance();
        date.set(Calendar.YEAR, 2024);
        date.set(Calendar.MONTH, Calendar.JUNE);
        date.set(Calendar.DAY_OF_MONTH, 2);
        date.set(Calendar.HOUR_OF_DAY, 2);
        date.set(Calendar.MINUTE, 31);
        date.set(Calendar.SECOND, 30);
        date.set(Calendar.MILLISECOND, 0);


        // timer.schedule(task, 0);
        // timer.schedule(task, date.getTime());
        timer.scheduleAtFixedRate(new TimerTask() { // timer.scheduleAtFixedRate(class TimerTask(), start time, do every ? milisecond)
            int counter = 10;
            public void run()
            {
                if (counter > 0)
                {
                    System.out.println(counter + " Second");
                    counter--;
                }
                else
                {
                    System.out.println("HAPPY NEW YEARRRR");
                    timer.cancel();
                }

            }
        }, date.getTime(), 1000);
    }
}