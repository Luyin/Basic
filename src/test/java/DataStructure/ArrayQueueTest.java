package DataStructure;

import DataStructure.Queue.ArrayQueue;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by myrao_000 on 2017-02-16.
 */
public class ArrayQueueTest {
    private ArrayQueue<Integer> queue;

    @Before
    public void init()
    {
        queue = new ArrayQueue<Integer>();

        queue.enqueue(new Integer(1));
        queue.enqueue(new Integer(2));
        queue.enqueue(new Integer(3));
        queue.enqueue(new Integer(4));
        queue.enqueue(new Integer(5));
    }

    @Test
    public void dequeueTest()
    {
        Integer number = queue.dequeue();

        assertEquals(new Integer(1), number, 0);
    }

    @Test
    public void emptyTest()
    {
        assertEquals(false, queue.isEmpty());
    }
}
