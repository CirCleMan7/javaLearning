import java.util.Scanner;
import java.util.Random;

public class guessNumber
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        Random random = new Random();

        // int i = scanner.nextInt();
        int i;
        int x = random.nextInt(10) + 1;
        double y = random.nextDouble();
        boolean z = random.nextBoolean();
        String reponse;
        // int loop = 1;
    
        while (true)
        {
            i = scanner.nextInt();
            while (i != x)
            {
                if (i < x)
                {
                    System.out.println("more than");
                }
                else if(i > x)
                {
                    System.out.println("less than");
                }
                // System.out.println("Wrong");/
                i = scanner.nextInt();
            }
            System.out.println("correct");  
            System.out.println("Do you want to play again");
            System.out.println("Q or q for quit");
            scanner.nextLine();
            reponse = scanner.nextLine();
            if (reponse.equals("q") || reponse.equals("Q"))
                break;
        }


    }
}