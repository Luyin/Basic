package Sort;

/**
 * Created by myrao_000 on 2017-02-05.
 */
public class QuickSort {
    private static void Swap(int[] list, int i, int j)
    {
        int temp = list[i];
        list[i] = list[j];
        list[j] = temp;
    }

    public static void AscendingSort(int[] list, int start_index, int end_index) {
        //1. 기준 선택
        int pivot = start_index;

        int left = start_index + 1;
        int right = end_index;

        //더 이상 나눌 수 없는 경우
        if(right - left < 1) return;
        if(start_index < 0) return;
        if(end_index >= list.length) return;

        //2. 기준 보다 크거나 기준 보다 작은 값들 찾아서 교환
        while(left<right)
        {
            for(;left<right;left++)
            {
                if(list[left] > list[pivot])
                    break;
            }

            for(;left<right;right--)
            {
                if(list[right] < list[pivot])
                    break;
            }

            if(left != right)
            {
                Swap(list, start_index, end_index);
            }
        }

        //3. 찾는 값들끼리 만났을 경우, 기준값과 왼쪽 찾은 값을 비교하고 서로 교환
        if(list[left] < list[pivot])
        {
            Swap(list,left, pivot);
            pivot = left;
        }

        //4. 기준을 제외한 나머지 부분들 재귀 호출
        AscendingSort(list,start_index ,pivot-1);
        AscendingSort(list,pivot+1 ,end_index);
    }

    public static void DscendingSort(int[] list, int start_index, int end_index) {
        //1. 기준 선택 (기준 선택 방법은 다양하다. 아무거나 해도 상관없다).
        int pivot = start_index;

        int left = start_index+1;
        int right = end_index;

        if(right-left < 1) return;
        if(start_index < 0) return;
        if(right >= list.length) return;

        while(left < right)
        {
            for(;left<right; left++)
            {
                if(list[left] < list[pivot])
                {
                    break;
                }
            }

            for(;left<right; right--)
            {
                if(list[right] > list[pivot])
                {
                    break;
                }
            }

            if(left != right)
            {
                Swap(list, left, right);
            }
        }

        if(list[left] > list[pivot])
        {
            Swap(list, left, pivot);
            pivot = left;
        }

        DscendingSort(list, start_index, pivot-1);
        DscendingSort(list, pivot+1, end_index);
    }
}
