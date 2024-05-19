import java.util.Scanner;
import java.util.*;

public class tryCatch
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        try
        {
            System.out.print("a : ");
            int a = scanner.nextInt();

            System.out.print("b : ");
            int b = scanner.nextInt();

            int answer = a / b;

            System.out.println("a / b = " + answer);
        }
        // catch (ArithmeticException e)
        // {
        //     System.out.println("Error : Math error");
        // }
        // catch (InputMismatchException e)
        // {
        //     System.out.println("Error : Inpur error");
        // }
        catch (Exception e)
        {
            System.out.println("Error : Something error");
        }
        finally
        {
            System.out.println("So bad");
        }

    }
}