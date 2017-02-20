package Algorithm;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * Created by myrao_000 on 2017-02-18.
 */
public class DateCalculator {
    public static void Calculate(){
        Calendar cal = Calendar.getInstance();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
        Date startDate = null;
        Date endDate = null;

        try {
            startDate = sdf.parse("19641010");
            endDate = sdf.parse("20200724");
        } catch (ParseException e) {
            e.printStackTrace();
        }

        while(startDate.compareTo(endDate) <= 0)
        {
            cal.setTime(startDate);

            //YYYYMMDD의 포맷으로 변경
            String strDate = sdf.format(cal.getTime());
            //2진수 변환
            String strBinaryDate = Integer.toBinaryString(Integer.parseInt(strDate));
            //반대로 전환
            StringBuffer stbReverseBinaryDate = new StringBuffer(strBinaryDate).reverse();

            //2진수 끼리 비교
            if(strBinaryDate.equals(stbReverseBinaryDate.toString()))
            {
                System.out.println(strDate);
            }

            cal.add(Calendar.DATE, 1);

            startDate = cal.getTime();

        }
    }
}
