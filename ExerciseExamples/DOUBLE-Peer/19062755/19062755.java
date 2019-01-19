import java.util.*;
class doublehaha
{
    public static void main(String args[])
    {
        Scanner obj=new Scanner(System.in);
        
        String s="";
        int t,l,i;
        t=obj.nextInt();
        
        for(i=0;i<t;i++)
        {
            l=obj.nextInt();
        
            if(l%2==0)
            System.out.println(l);
            else
            System.out.println(l-1);
        }
    }
}