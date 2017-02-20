package DataStructure.Queue;

import java.lang.reflect.Array;

/**
 * Created by myrao_000 on 2017-02-15.
 */
public class ArrayQueue<T> {
    private T[] intArray;
    private int intEndPosition;

    public ArrayQueue()
    {
        intArray = (T[]) new Object[10];
        intEndPosition = -1;
    }

    public void enqueue(T data)
    {
        if((intEndPosition+1) >= intArray.length)
        {
            T[] intNewArray = (T[]) new Object[intArray.length * 2];
            System.arraycopy(intArray, 0, intNewArray, 0, intArray.length);
            intArray = intNewArray;
            enqueue(data);
        }
        else
        {
            intArray[++intEndPosition] = data;
        }
    }

    public T dequeue()
    {
        if(intEndPosition < 0)
        {
            return null;
        }
        else
        {
            T data = intArray[0];
            intEndPosition--;
            System.arraycopy(intArray, 1, intArray, 0, (intEndPosition+1));
            return data;
        }
    }

    public boolean isEmpty()
    {
        return (intEndPosition < 0);
    }
}
