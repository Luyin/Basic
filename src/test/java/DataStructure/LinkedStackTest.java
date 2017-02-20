package DataStructure;

import DataStructure.Stack.LinkedStack;
import org.junit.Before;
import org.junit.Test;

import org.openjdk.jmh.annotations.Benchmark;
import org.openjdk.jmh.annotations.BenchmarkMode;
import org.openjdk.jmh.annotations.Mode;
import org.openjdk.jmh.annotations.OutputTimeUnit;

import java.util.concurrent.TimeUnit;

import static junit.framework.TestCase.assertEquals;

/**
 * Created by myrao_000 on 2017-02-15.
 */
@BenchmarkMode({Mode.AverageTime})
@OutputTimeUnit(TimeUnit.MILLISECONDS)
public class LinkedStackTest {
    LinkedStack stack;
    @Before
    public void init()
    {
        stack = new LinkedStack();
    }

    @Test
    @Benchmark
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
