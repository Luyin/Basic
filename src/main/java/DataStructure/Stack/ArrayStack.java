package DataStructure.Stack;

import java.util.EmptyStackException;
import java.util.Stack;

/**
 * Created by myrao_000 on 2017-02-15.
 */
public class ArrayStack {
    private int[] intArray;
    private int intPosition;

    public ArrayStack()
    {
        this.intArray = new int[10];
        intPosition = -1;
    }

    public void push(int data)
    {
        if((intPosition+1) >= intArray.length)
        {
            int[] intNewArray = new int[this.intArray.length * 2];
            System.arraycopy(this.intArray, 0, intNewArray, 0, this.intArray.length);
            this.intArray = intNewArray;
            push(data);
        }
        else
        {
            this.intArray[++intPosition] = data;
        }
    }

    public int pop()
    {
        if(intPosition < 0)
        {
            throw new EmptyStackException();
        }
        else
        {
            return intArray[intPosition--];
        }

    }

    public boolean isEmpty()
    {
        return (intPosition < 0);
    }
}
