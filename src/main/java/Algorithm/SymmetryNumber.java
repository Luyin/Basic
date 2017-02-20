package Algorithm;

/**
 * Created by myrao_000 on 2017-02-18.
 */
public class SymmetryNumber {
    //n 번째 대칭수를 구하라.
    public Integer getSymmetryNumber(int number)
    {
        //1 ~ N 까지 number와 복사해서 수를 구한다.
        int i = 1;
        while(true)
        {
            int temp = number * i;
            boolean boolSuccess = false;

             //7의 배수인지 검사
             if(temp % 7 == 0)
             {
                 //각 자리수 별로 7 또는 0 검사
                 String strNumber = String.valueOf(temp);

                 for(int j=0; j<strNumber.length(); j++)
                 {
                     char charcater = strNumber.charAt(j);

                     if(charcater != '7' && charcater != '0')
                     {
                        boolSuccess = false;
                        break;
                     }
                     else
                     {
                         boolSuccess = true;
                     }
                 }
             }

             if(boolSuccess)
             {
                 return temp;
             }

            i++;
         }
    }
}
