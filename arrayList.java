import java.util.ArrayList;

public class arrayList
{
    public static void main(String[] args)
    {
        ArrayList<String> food = new ArrayList<String>();
        ArrayList<String> game = new ArrayList<String>();
        ArrayList<ArrayList<String>> Mall = new ArrayList<ArrayList<String>>();

        food.add("KFC");
        food.add("Pizza");
        food.add("MK");
        food.set(0, "Mcdonald");
        food.remove(2);

        game.add("diablo 3");
        game.add("sleeping dog");

        Mall.add(food);
        Mall.add(game);
 
        for (int i = 0; i < game.size(); i++)
        {
            System.out.println(game.get(i));
        }

        for (String i : food)
        {
            System.out.println(i);
        }

        System.out.println(Mall);
        System.out.println(Mall.get(0));
        System.out.println(Mall.get(0).get(0));

    }
}