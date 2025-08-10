/*1. Illustrates with an example of using Singleton class.*/

class Singleton
{
    private static Singleton inst;
    private Singleton()
    {
        System.out.println("Object-1");
    }

    public static Singleton getInstance()
    {
        if(inst==null)
        {
            inst=new Singleton();
        }
        System.out.println("Object Assigning");
        return inst;

    }
}
public class SingletonEg
{
    public static void main(String[] args)
    {
        Singleton obj=Singleton.getInstance();
        Singleton obj2=Singleton.getInstance();

        System.out.println(obj2==obj);
    }
}
