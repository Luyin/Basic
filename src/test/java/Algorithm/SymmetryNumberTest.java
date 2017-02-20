package Algorithm;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

/**
 * Created by myrao_000 on 2017-02-18.
 */
public class SymmetryNumberTest {
    private SymmetryNumber symNumber;

    @Before
    public void init()
    {
        symNumber = new SymmetryNumber();
    }

    @Test
    public void test()
    {
        assertEquals(7770, symNumber.getSymmetryNumber(6), 0);
    }

}
