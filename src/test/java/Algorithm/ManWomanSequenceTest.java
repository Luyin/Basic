package Algorithm;

import org.junit.Before;
import org.junit.Test;

/**
 * Created by myrao_000 on 2017-02-21.
 */
public class ManWomanSequenceTest {
    private ManWomanSequence manWomanSequence;

    @Before
    public void init()
    {
        manWomanSequence = new ManWomanSequence();
    }

    @Test
    public void test()
    {
        manWomanSequence.run();
    }
}
