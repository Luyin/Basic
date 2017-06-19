package Sort;

/**
 * Created by myrao_000 on 2017-02-05.
 */
public class BubbleSort {
    private static void swap(int[] intArray, int i, int j)
    {
        int temp = intArray[i];
        intArray[i] = intArray[j];
        intArray[j] = temp;

    }

    public static void sort(int[] intArray, boolean isAscending)
    {
        for(int i=0; i<intArray.length; i++)
        {
            for(int j=0; j<intArray.length - (i+1); j++)
            {
                if(isAscending)
                {
                    if(intArray[j] > intArray[j+1])
                    {
                        swap(intArray, j, j+1);
                    }
                }
                else
                {
                    if(intArray[j] < intArray[j+1])
                    {
                        swap(intArray, j, j+1);
                    }
                }
            }
        }
    }
}
