package Algorithm;

import DataStructure.Heap.ArrayBTHeap;
import com.sun.org.apache.xpath.internal.operations.Bool;

import java.util.*;

/**
 * Created by myrao_000 on 2017-03-11.
 */
public class WorldCup {
    public static void main(String [] args) {
        String[] arrayNation = new String[32];
        int maxLength = 0;

        //배열에 담기
        init(arrayNation);

        //배열 순회 하며 List에 담기
        ArrayList<String> mList = new ArrayList<String>();
        ArrayList<String> mMaxLengthList = null;

        for(int i=0; i<arrayNation.length; i++)
        {
            String[] copiedArrayNation = new String[arrayNation.length];
            System.arraycopy(arrayNation, 0, copiedArrayNation, 0, arrayNation.length);

            String strOrigin = copiedArrayNation[i];
            mList.add(copiedArrayNation[i]);
            copiedArrayNation[i] = null;

            //배열 던지기
            while((strOrigin = findNextMatchedNation(copiedArrayNation, strOrigin)) != null)
            {
                mList.add(strOrigin);
            }

            if(mList.size()> maxLength)
            {
                maxLength = mList.size();
                mMaxLengthList = (ArrayList<String>) mList.clone();
            }

            mList.clear();
        }

        System.out.println("최대 길이는 " + maxLength);
        Iterator<String> it = mMaxLengthList.iterator();

        while(it.hasNext())
        {
            System.out.println(it.next());
        }
    }

    public static String findNextMatchedNation(String[] copiedArrayNation, String strOrigin)
    {
        for(int j=0; j<copiedArrayNation.length; j++)
        {
            if(copiedArrayNation[j] != null)
            {
                if(copiedArrayNation[j].toLowerCase().charAt(0) == strOrigin.toLowerCase().charAt(strOrigin.length()-1))
                {
                    String value = copiedArrayNation[j];
                    copiedArrayNation[j] = null;
                    return value;
                }
            }
        }

        return null;
    }

    public static void init(String[] arrayString)
    {
        arrayString[0] = "Brazil";
        arrayString[1] = "Croatia";
        arrayString[2] = "Mexico";
        arrayString[3] = "Cameroon";
        arrayString[4] = "Spain";
        arrayString[5] = "Netherlands";
        arrayString[6] = "Chile";
        arrayString[7] = "Australia";
        arrayString[8] = "Colombia";
        arrayString[9] = "Greece";
        arrayString[10] = "Cote d'lvoire";
        arrayString[11] = "Japan";
        arrayString[12] = "Uruguay";
        arrayString[13] = "Costa Rica";
        arrayString[14] = "England";
        arrayString[15] = "Italy";
        arrayString[16] = "Switzerland";
        arrayString[17] = "Ecuador";
        arrayString[18] = "France";
        arrayString[19] = "Honduras";
        arrayString[20] = "Argentina";
        arrayString[21] = "Bosnia and Herzegovina";
        arrayString[22] = "Iran";
        arrayString[23] = "Nigeria";
        arrayString[24] = "Germany";
        arrayString[25] = "Portugal";
        arrayString[26] = "Ghana";
        arrayString[27] = "USA";
        arrayString[28] = "Belgium";
        arrayString[29] = "Algeria";
        arrayString[30] = "Rusia";
        arrayString[31] = "Korea Republic";
    }
}
