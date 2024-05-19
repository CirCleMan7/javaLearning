import java.util.Scanner;

public class Hello_World
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("What is yours name?");
        System.out.print("My name is : ");
        String name = scanner.nextLine();

        System.out.println("What is your age?");
        System.out.print("My age is : ");
        int age = scanner.nextInt();

        System.out.println("What is your favourite food?");
        System.out.print("My favourite food is : ");
        scanner.nextLine();
        String food = scanner.nextLine();

        System.out.println("Hello " + name);
        System.out.println("Your age is " + age);
        System.out.println("Your favourite food is " + food);
    
    }
}