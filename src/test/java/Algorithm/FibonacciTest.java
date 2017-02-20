package Algorithm;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

/**
 * Created by myrao_000 on 2017-02-18.
 */
public class FibonacciTest {
    private Fibonacci fibonacci;

    @Before
    public void init()
    {
        fibonacci = new Fibonacci();

        for(int i=0; i<20; i++)
        {
            fibonacci.getFibonacciNumber(i);
        }
    }

    @Test
    public void getNumberTest()
    {
        assertEquals(new Integer(34), fibonacci.getFibonacciNumber(8));
    }
}
