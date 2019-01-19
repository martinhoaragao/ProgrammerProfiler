import java.util.*;
class jar
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt(),i,a[]=new int[t];
        for(i=0;i<t;i++)
        {
            a[i]=sc.nextInt();
            if(a[i]%2!=0)
                a[i]=a[i]-1;
        }   
        for(i=0;i<t;i++)
            System.out.println(a[i]);
    }
}