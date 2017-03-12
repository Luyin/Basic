package DesignPattern;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by myrao_000 on 2017-02-24.
 */
public class ObserverPattern {
    public static void main(String[] args)
    {
        KBS kbs = new KBS();

        kbs.Attach(new Viewer1());
        kbs.Attach(new Viewer2());

        kbs.Notify();
    }
}

interface Broadcaster
{
    public void Attach(Observer o);

    public void Detach(Observer o);

    public void Notify();
}

interface Observer
{
    public void update();
}

class KBS implements Broadcaster
{
    private List<Observer> mList;

    public KBS()
    {
        mList = new ArrayList<Observer>();
    }

    public void Attach(Observer o) {
        mList.add(o);
    }

    public void Detach(Observer o) {
        mList.remove(o);
    }

    public void Notify() {
        Iterator<Observer> it = mList.iterator();

        while(it.hasNext())
        {
            Observer observer = it.next();
            observer.update();
        }
    }
}

class Viewer1 implements Observer
{
    public void update()
    {
        System.out.println("시청자 1은 업데이트 되었습니다.");
    }
}

class Viewer2 implements Observer
{
    public void update()
    {
        System.out.println("시청자 2는 업데이트 되었습니다.");
    }
}

