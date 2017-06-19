package Sort;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

/**
 * Created by Luyin on 2017-06-19.
 */
public class BubbleSortTest {
    private int[] intArray = {5, 1, -3, 5, 4, 14, 62, 28, 0, -7, 258};

    @Before
    public void init(){
    }

    @Test
    public void ascendingTest() {
        BubbleSort.sort(intArray, true);

        assertArrayEquals(new int[]{-7, -3, 0 ,1 ,4, 5, 5, 14, 28, 62, 258},intArray);
    }

    @Test
    public void descendingTest() {
        BubbleSort.sort(intArray, false);
        assertArrayEquals(new int[]{258, 62, 28, 14, 5, 5, 4, 1, 0, -3, -7}, intArray);
    }
}
