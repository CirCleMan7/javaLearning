public class GenericsFunction
{

    public static void main(String[] args)
    {
        Integer[] intArray = {1, 2, 3, 4, 5};
        Character[] charArray = {'a', 'b', 'c', 'd', 'e'};
        Double[] doubleArray = {1.0, 2.0, 3.0, 4.0, 5.0};
        String[] stringArray = {"cat", "dog", "wolf", "fish", "turtle"};

        // printIntArray(intArray);
        // printcharArray(charArray);
        // printDoubleArray(doubleArray);
        // printStringArray(stringArray);

        // printArray(intArray);
        // printArray(charArray);
        // printArray(doubleArray);
        // printArray(stringArray);

        System.out.println(returnArray(intArray));

    }

    // public static void printIntArray(Integer[] intArray)
    // {
    //     for (Integer i : intArray)
    //     {
    //         System.out.print(i + " ");
    //     }
    //     System.out.println();
    // }

    // public static void printcharArray(Character[] charArray)
    // {
    //     for (Character i : charArray)
    //     {
    //         System.out.print(i + " ");
    //     }
    //     System.out.println();
    // }

    // public static void printDoubleArray(Double[] doubleArray)
    // {
    //     for (Double i : doubleArray)
    //     {
    //         System.out.print(i + " ");
    //     }
    //     System.out.println();
    // }

    // public static void printStringArray(String[] stringArray)
    // {
    //     for (String i : stringArray)
    //     {
    //         System.out.print(i + " ");
    //     }
    //     System.out.println();
    // }

    public static <Thing> void printArray(Thing[] array) // you can write <Thing> or <T> whatever you want
    {
        for (Thing i : array)
        {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static <Thing> Thing returnArray(Thing[] array)
    {
        return array[0];
    }
}