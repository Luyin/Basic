package Search;

/**
 * Created by myrao_000 on 2017-02-06.
 */
public class LinearSerach {
    public static int Search(int[] list, int value) {
        for(int i=0; i<list.length; i++)
        {
            if(list[i] == value)
            {
                return i;
            }
        }

        return -1;
    }
}
