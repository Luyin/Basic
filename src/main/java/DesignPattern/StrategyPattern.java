package DesignPattern;

/**
 * Created by myrao_000 on 2017-02-19.
 */
public class StrategyPattern {
    private PTZAction ptzAction;

    public StrategyPattern(PTZAction ptzAction)
    {
        this.ptzAction = ptzAction;
    }

    public boolean goPan()
    {
        return this.ptzAction.Pan();
    }

    public boolean goTilt()
    {
        return this.ptzAction.Tilt();
    }

    public boolean goZoom()
    {
        return this.ptzAction.Zoom();
    }
}

interface PTZAction
{
    boolean Pan();
    boolean Tilt();
    boolean Zoom();
}

class PTZModel implements  PTZAction
{
    public boolean Pan()
    {
        System.out.println("PTZModel Pan Start");
        return true;
    }

    public boolean Tilt()
    {
        System.out.println("PTZModel Tilt Start");
        return true;
    }

    public boolean Zoom()
    {
        System.out.println("PTZModel Zoom Start");
        return true;
    }
}

class ZoomModel implements  PTZAction
{
    public boolean Pan()
    {
        System.out.println("ZoomModel Pan failed");
        return false;
    }

    public boolean Tilt()
    {
        System.out.println("ZoomModel Tilt failed");
        return false;
    }

    public boolean Zoom()
    {
        System.out.println("ZoomModel Zoom Start");
        return true;
    }
}