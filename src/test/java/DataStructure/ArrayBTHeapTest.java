package DataStructure;

import DataStructure.Heap.ArrayBTHeap;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

/**
 * Created by myrao_000 on 2017-02-17.
 */
public class ArrayBTHeapTest {
    ArrayBTHeap heap;
    @Before
    public void init()
    {
        heap = new ArrayBTHeap();

        heap.addNode(2);
        heap.addNode(7);
        heap.addNode(52);

        heap.addNode(13);
        heap.addNode(8);
        heap.addNode(67);
        heap.addNode(161);

        heap.addNode(17);
        heap.addNode(43);
        heap.addNode(88);
        heap.addNode(37);
    }

    @Test
    public void printheap()
    {
        heap.printHeap();
        assertEquals(2, heap.removeNode(), 0);
        System.out.println();
        heap.printHeap();
    }
}
