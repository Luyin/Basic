package DesignPattern;

/**
 * Created by myrao_000 on 2017-02-19.
 */
public class TemplateMethod {
    private String strCameraModelName  = "";

    public void goPreset(PTZMove ptzMove)
    {
        ptzMove.Pan();
        ptzMove.Tilt();
        ptzMove.Zoom();
    }
}

interface PTZMove
{
    boolean Pan();
    boolean Tilt();
    boolean Zoom();
}
