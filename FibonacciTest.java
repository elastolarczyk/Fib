package main;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FibonacciTest {

    int n;

    Fibonacci test1 = new Fibonacci(n);

    @Test
    public void fibbTest1()
    {
        assertEquals(0, test1.fibb(0));
    }

    @Test
    public void fibbTest2()
    {
        assertEquals(1, test1.fibb(1));
    }

    @Test
    public void fibbTest3()
    {
        assertEquals(1, test1.fibb(2));
    }

    @Test
    public void fibbTest4()
    {
        assertEquals(8, test1.fibb(6));
    }

    @Test
    public void fibbTest5()
    {
        assertEquals(4181, test1.fibb(19));
    }

    @Test(expected = RuntimeException.class)
    public void fibbShouldGiveAnExceptionTest6()
    {
        test1.fibb(-3);
    }
}


