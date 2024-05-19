public class stringMethod
{
    public static void main(String[] args)
    {
        String name = "eiei";

        int len = name.length();
        char chr = name.charAt(0);
        int index = name.indexOf('e');
        // boolean result = name.isEmpty();
        // String result = name.toUpperCase();
        // String result = name.toLowerCase();
        // String result = name.trim();
        String result = name.replace('e', 'b');

        System.out.println("len " + len);
        System.out.println("chr " + chr);
        System.out.println("index " + index);
        System.out.println("result " + result);

    }
}