package Algorithm;

/**
 * Created by myrao_000 on 2017-02-21.
 */
public class ManWomanSequence {
    private Person[] people;
    private int intCountWomen;
    private int intCountMan;
    private int intTotalCount;

    public ManWomanSequence()
    {
        this.people = new Person[30];

        for(int i=0; i<people.length; i++)
        {
            this.people[i] = new Person();
        }

        this.intCountMan = 20;
        this.intCountWomen = 10;
        this.intTotalCount = 0;
    }

    public void run()
    {
        GenerateCombination(0, this.intCountMan, this.intCountWomen);

        System.out.println("total count : " + intTotalCount);
    }

    public void GenerateCombination(int index, int intCountMan, int intCountWomen)
    {
        if(index >= people.length)
        {
            if(!checkCountManWoman())
            {
                intTotalCount++;
            }
            return;
        }

        if(intCountMan > 0)
        {
            people[index].setSex(new Integer(1));
            GenerateCombination(index+1, intCountMan-1,  intCountWomen);
        }

        if(intCountWomen > 0)
        {
            people[index].setSex(new Integer(0));
            GenerateCombination(index+1, intCountMan,  intCountWomen-1);
        }

        people[index].setSex(null);
    }

    public boolean checkCountManWoman()
    {
        Integer Man = new Integer(1);
        Integer Woman = new Integer(0);

        for(int i=0; i<people.length; i++)
        {
            int CountMan = 0;
            int CountWoman = 0;

            for(int j=0; j<i; j++)
            {
                if(people[j].getSex().equals(Woman))
                {
                    CountWoman++;
                }
                else
                {
                    CountMan++;
                }
            }

            if(CountMan != CountWoman)
            {
                return false;
            }

            CountMan = 0;
            CountWoman = 0;

            for(int k=i; k<people.length; k++)
            {
                if(people[i].getSex().equals(Woman))
                {
                    CountWoman++;
                }
                else
                {
                    CountMan++;
                }
            }

            if(CountMan != CountWoman)
            {
                return false;
            }
        }

        return true;
    }
}

class Person {
    // 1 is man 0 is woman
    private Integer sex = null;

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }
}
