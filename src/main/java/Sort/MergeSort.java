package Sort;

/**
 * Created by myrao_000 on 2017-02-05.
 */
public class MergeSort {
    private static void Swap(int[] list, int i, int j)
    {
        int temp = list[i];
        list[i] = list[j];
        list[j] = temp;
    }

    private static void AscendingMerge(int[] list, int start_index, int middle_index, int end_index)
    {
        int [] merged_Array = new int[end_index - start_index + 1];

        int startIndex = start_index;
        int middleIndex = middle_index+1;

        for(int i= 0; i<merged_Array.length + 1; i++)
        {
            if(startIndex <= middle_index && middleIndex <= end_index)
            {
                if(list[startIndex] < list[middleIndex])
                {
                    merged_Array[i] = list[startIndex++];
                }
                else
                {
                    merged_Array[i] = list[middleIndex++];
                }
            }
            else if(startIndex <= middle_index)
            {
                merged_Array[i] = list[startIndex++];
            }
            else if(middleIndex <= end_index)
            {
                merged_Array[i] = list[middleIndex++];
            }
        }

        System.arraycopy(merged_Array, 0, list, start_index, merged_Array.length);
    }

    public static void AscendingSort(int[] list, int start_index, int end_index)
    {
        //end_index=3 , start_index= 1 일때 무한 반복이 일어난다.
        if(end_index - start_index < 1) return;

        int middle_index = Math.round((end_index-start_index) / 2) + start_index;

        AscendingSort(list, start_index, middle_index);
        AscendingSort(list, middle_index+1, end_index);

        AscendingMerge(list, start_index, middle_index, end_index);
    }

    public static void DscendingMerge(int[] list, int start_index, int middle_index, int end_index)
    {
        int [] merged_Array = new int[end_index - start_index + 1];

        int startIndex = start_index;
        int middleIndex = middle_index+1;

        for(int i= 0; i<merged_Array.length; i++)
        {
            if(startIndex <= middle_index && middleIndex <= end_index)
            {
                if(list[startIndex] > list[middleIndex])
                {
                    merged_Array[i] = list[startIndex++];
                }
                else
                {
                    merged_Array[i] = list[middleIndex++];
                }
            }
            else if(startIndex <= middle_index)
            {
                merged_Array[i] = list[startIndex++];
            }
            else if(middleIndex <= end_index)
            {
                merged_Array[i] = list[middleIndex++];
            }
        }

        System.arraycopy(merged_Array, 0, list, start_index, merged_Array.length);
    }

    public static void DscendingSort(int[] list, int start_index, int end_index) {
        if(end_index - start_index < 1) return;

        int middle_index = Math.round((end_index-start_index) / 2) + start_index;

        DscendingSort(list, start_index, middle_index);
        DscendingSort(list, middle_index+1, end_index);

        DscendingMerge(list, start_index, middle_index, end_index);
    }
}
