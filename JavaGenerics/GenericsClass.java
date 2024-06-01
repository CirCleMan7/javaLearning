// class myCharacter
// {
//     Character chr;

//     myCharacter(Character chr)
//     {
//         this.chr = chr;
//     }

//     public Character getValue()
//     {
//         return chr;
//     }
// }

// class myInteger
// {
//     Integer num;

//     myInteger(Integer num)
//     {
//         this.num = num;
//     }

//     public Integer getValue()
//     {
//         return num;
//     }
// }

class MyGenericsClassTwo <T, Eiei>      // you can write T or Thing whatever you want
{                                    // can use <T extends Number> to lock that T need to be subclass of Number
    T x; 
    Eiei y;                          // can use <>
    
    MyGenericsClassTwo(T x, Eiei y)
    {
        this.x = x;
        this.y = y;
    }

    public T getValue()
    {
        return x;
    }

    public Eiei getAnotherValue()
    {
        return y;
    }
}               
                            // you can write T or Thing whatever you want
class MyGenericsClass <T>   // Extra : Bounded type
{                           // can use <T extends Number> to lock that T need to be subclass of Number
    T x;                    // can use <? super T> in method to make sure that only subclass of T can use
    
    MyGenericsClass(T x)
    {
        this.x = x;
    }

    public T getValue()
    {
        return x;
    }
}

public class GenericsClass
{
    public static void main(String[] args)
    {
        Integer num = 1;
        Character chr = 'a';
        Double dec = 1.0;
        String str = "Hello";

        // myCharacter myChr = new myCharacter(chr);
        // myInteger myInt = new myInteger(num);

        // System.out.println(myChr.getValue());
        // System.out.println(myInt.getValue());

        MyGenericsClass<Character> myChr = new MyGenericsClass<>(chr);
        MyGenericsClass<Integer> myInt = new MyGenericsClass<>(num);
        MyGenericsClass<Double> myDec = new MyGenericsClass<>(dec);
        MyGenericsClass<String> myStr = new MyGenericsClass<>(str);
        MyGenericsClassTwo<String, Integer> myNumChar = new MyGenericsClassTwo<>(str, num);

        System.out.println(myChr.getValue());
        System.out.println(myInt.getValue());
        System.out.println(myDec.getValue());
        System.out.println(myStr.getValue());

        System.out.println();
        System.out.println(myNumChar.getValue());
        System.out.println(myNumChar.getAnotherValue());

    }
}