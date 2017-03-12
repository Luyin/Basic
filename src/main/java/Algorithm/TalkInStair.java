package Algorithm;

/**
 * Created by myrao_000 on 2017-03-12.
 */
public class TalkInStair {
    private static int count = 0;

    public static void main(String[] args)
    {
        int indexOfA = 0;
        int indexOfB = 10;

        Move(indexOfA, indexOfB);
        System.out.println(count);
    }

    public static void Move(int indexOfA, int indexOfB)
    {
        //끝나는 조건 A가 B를 앞지른 경우
        if(indexOfA > indexOfB) return;

        //성공한 조건 A와 B가 같은 경우
        if(indexOfA == indexOfB)
        {
            count++;
            return;
        }
        else
        {
            for(int i=1; i<4; i++)
            {
                for(int j=1; j<4; j++)
                {
                    Move(indexOfA+i, indexOfB-j);
                }
            }
        }
    }

}
