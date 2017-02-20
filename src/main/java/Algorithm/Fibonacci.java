package Algorithm;

/**
 * Created by myrao_000 on 2017-02-18.
 */
public class Fibonacci {
    private Integer[] ArrayResult = new Integer[10];

    //N 번째 피보나치 수를 구하는 공식
    public Integer getFibonacciNumber(int number)
    {
        if(number == 0)
        {
            return ArrayResult[number] = new Integer(1);
        }
        else if(number == 1)
        {
            return ArrayResult[number] = new Integer(1);
        }
        else
        {
            if(number >= ArrayResult.length)
            {
                Integer[] temp = new Integer[ArrayResult.length * 2];
                System.arraycopy(ArrayResult,0, temp, 0, ArrayResult.length);
                ArrayResult = temp;
            }

            if(ArrayResult[number-1] == null || ArrayResult[number-2] == null)
            {
                ArrayResult[number] = getFibonacciNumber(number-1) + getFibonacciNumber(number-2);
            }
            else
            {
                ArrayResult[number] = ArrayResult[number-1] + ArrayResult[number-2];
            }

            return ArrayResult[number];
        }
    }
}
