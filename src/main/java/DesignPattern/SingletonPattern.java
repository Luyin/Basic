package DesignPattern;

/**
 * Created by myrao_000 on 2017-02-24.
 */
public class SingletonPattern {
    private volatile static SingletonPattern Instance;

    public static synchronized SingletonPattern getInstance()
    {
        if(Instance == null)
        {
            synchronized (Instance)
            {
                if(Instance == null)
                {
                    Instance = new SingletonPattern();
                }
            }
        }

        return Instance;
    }
}
