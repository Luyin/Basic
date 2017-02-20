package Sort;

/**
 * Created by myrao_000 on 2017-02-05.
 */
public class InsertSort {

    private static void Swap(int[] list, int i, int j)
    {
        int temp = list[i];
        list[i] = list[j];
        list[j] = temp;
    }

    //int[] list = {1, 5, 7, 23, 7, 8, 10, 44, 4};
    public static void AscendingSort(int[] list) {
        //왼쪽에서 부터 값 하나를 정렬 범위에 넣는다.

        for(int i=0; i<list.length; i++)
        {
            int key = list[i];

            //정렬 범위 내의 오른쪽에서 부터 위치를 찾아간다.
            for(int j=i-1; j >= 0 ; j--)
            {
                if(list[j] > key)
                {
                    Swap(list, j,j+1);
                }
                else
                {
                    break;
                }
            }
        }
    }

    public static void DscendingSort(int[] list) {
        for(int i=0; i<list.length; i++)
        {
            int key = list[i];

            for(int j=i-1; j>=0; j--)
            {
                if(list[j] < key )
                {
                    Swap(list, j, j+1);
                }
                else
                {
                    break;
                }
            }
        }
    }
}
