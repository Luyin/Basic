package DesignPattern;

import org.junit.Before;
import org.junit.Test;

/**
 * Created by myrao_000 on 2017-02-24.
 */
public class SingletonPatternTest {
    private SingletonPattern object;

    @Before
    public void init()
    {
        object = SingletonPattern.getInstance();
    }

    @Test
    public void test()
    {

    }
}
