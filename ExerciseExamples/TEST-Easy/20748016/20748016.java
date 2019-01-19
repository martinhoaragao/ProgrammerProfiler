    import java.util.*;
    class y
    {
        public static void main(String[] args)
        {
            Scanner sc=new Scanner(System.in);
            int[] a=new int[50];
            int i1=0;
            while(sc.hasNext())
            {
                a[i1]=sc.nextInt();
                i1++;
            }
            for(int i=0;;i++)
            {
                if(a[i]==42)
                break;
                else
                System.out.println(a[i]);
            }
        }
    }