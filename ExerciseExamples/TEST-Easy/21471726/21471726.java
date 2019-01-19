import java.util.*;
class cool
{
    public static void main(String []args)
    {
        try
        {
            Scanner ob = new Scanner (System.in);
            int i,n;
            for(i=1;;i++)
            {
                n=ob.nextInt();
                if(n==42)
                    break;
                System.out.println(n);
            }
        }
        catch(Exception e)
        {
        }
    }
}

