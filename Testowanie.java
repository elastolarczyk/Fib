package main;

public class  Testowanie {

    public int addition(int a, int b)
    {
        return a + b;
    }

    public int multi(int a, int b)
    {
        return a * b;
    }
/*
    public int div(int a, int b)
    {
        if (b == 0)
            {
                throw new IllegalArgumentException("Nie dzieli się przez zero!");
            }
        else
            {
                return a / b;
            }
    }
 */
    public boolean interval(int min, int max, int value)
    {
        return value >= min && value <= max;
    }


}
