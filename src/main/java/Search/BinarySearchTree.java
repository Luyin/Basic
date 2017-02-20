package Search;

/**
 * Created by myrao_000 on 2017-02-06.
 */
public class BinarySearchTree {
    public static int Search(int[] list, int start_index, int end_index, int value){
        //1.calculate Divided index
        if(start_index > end_index) return -1;

        int index = (end_index - start_index) / 2 + start_index;
        // Compare big or small with parition

        if(list[index] == value )
        {
            return index;
        }
        else if(list[index] > value)
        {
            return Search(list, start_index,index-1, value);
        }
        else if(list[index] < value)
        {
            return Search(list, index+1, end_index, value);
        }

        return -1;
    }
}
