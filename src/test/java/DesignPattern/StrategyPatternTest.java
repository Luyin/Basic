package DesignPattern;

import org.junit.Before;
import org.junit.Test;

/**
 * Created by myrao_000 on 2017-02-19.
 */
public class StrategyPatternTest {
    private StrategyPattern strPattern;

    @Before
    public void init()
    {
        strPattern = new StrategyPattern(new ZoomModel());
    }

    @Test
    public void test()
    {
        strPattern.goZoom();
    }
}
