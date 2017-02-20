package DesignPattern;

import org.junit.Before;
import org.junit.Test;

/**
 * Created by myrao_000 on 2017-02-19.
 */
public class TemplateMethodTest {
    private TemplateMethod tempMethod;

    @Before
    public void init()
    {
        tempMethod = new TemplateMethod();

        tempMethod.goPreset(new PTZMove() {
            @Override
            public boolean Pan() {
                return false;
            }

            @Override
            public boolean Tilt() {
                return false;
            }

            @Override
            public boolean Zoom() {
                return false;
            }
        });
    }

    @Test
    public void test()
    {

        tempMethod.goPreset(new PTZMove() {
            @Override
            public boolean Pan() {
                return true;
            }

            @Override
            public boolean Tilt() {
                return false;
            }

            @Override
            public boolean Zoom() {
                return true;
            }
        });
    }
}
