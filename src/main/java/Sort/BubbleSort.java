package Sort;

/**
 * Created by myrao_000 on 2017-02-05.
 */
public class BubbleSort {
    private static void Swap(int[] list, int i, int j)
    {
        int temp = list[i];
        list[i] = list[j];
        list[j] = temp;
    }

    //큰 값을 오른쪽으로 몰아낸다.
    public static void AscendingSort(int[] list) {
        for (int i=0; i<list.length; i++)
        {
            for(int j=0; j<list.length - (i + 1); j++)
            {
                if (list[j] > list[j + 1]) {
                    Swap(list, j, j+1);
                }
            }
        }
    }

    //작은 값을 오른쪽으로 몰아낸다.
    public static void DscendingSort(int[] list) {
        for (int i=0; i<list.length; i++)
        {
            for(int j=0; j<list.length - (i +1); j++)
            {
                if(list[j] < list[j + 1])
                {
                    Swap(list, j, j+1);
                }
            }

        }
    }
}
