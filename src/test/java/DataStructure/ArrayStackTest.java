package DataStructure;

import DataStructure.Stack.ArrayStack;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

/**
 * Created by myrao_000 on 2017-02-15.
 */
public class ArrayStackTest {
    ArrayStack stack;
    @Before
    public void init()
    {
        stack = new ArrayStack();
    }

    @Test
    public void pushTest()
    {
        int intLastData = 4;

        for(int i=0; i<13; i++)
        {
            stack.push(i);
        }

        stack.push(intLastData);

        assertEquals(intLastData, stack.pop(), 0);
    }
}
