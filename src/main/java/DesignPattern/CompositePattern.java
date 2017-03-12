package DesignPattern;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by myrao_000 on 2017-02-24.
 */

//Component
interface Unit{
    void print();
}
public class CompositePattern implements Unit{
    private List<Unit> mList = new ArrayList<Unit>();

    public void add(Unit unit)
    {
        mList.add(unit);
    }

    public void remove(Unit unit)
    {
        mList.remove(unit);
    }

    public void print(){
        Iterator<Unit>  it = mList.iterator();
        while(it.hasNext())
        {
            Unit unit = it.next();
            unit.print();
        }
    }
}

//Leaf
class Marine implements Unit
{
    public void print()
    {
        System.out.println("나는 마린 이다.");
    }
}

//Leaf
class Firebat implements Unit
{
    public void print()
    {
        System.out.println("나는 파이어 뱃이다.");
    }
}

//Leaf
class Medic implements Unit
{
    public void print()
    {
        System.out.println("나는 메딕이다.");
    }
}

