interface test
{
    int plusOne(int x, int y);
}

public class interfaceMain
{
    public static void main(String[] args)
    {
        human human1 = new human();
        thaiPerson human2 = new human();
        muStudent human3 = new human();

        human1.showName();
        human1.showID();
        human2.showName();
        human3.showID();

        human human11 = new human("troy");
        human human12 = new human("atom");
        human human13 = new human("woody");
        thaiPerson[] people = {human11, human12, human13};


        // people = {human11, human12, human13};

        for (thaiPerson i : people)
        {
            i.showName();
        }

        human1.say();

        test test1 = (int x, int y) -> {
            x += 1;
            System.out.println("Hello World " + x);
            return x;
        };

        test1::plusOne(2, 4);

    }
}