import java.util.*;

 class main {
    public static void main(String[] args)
    {
        int n,k,t;
        Scanner sc=new Scanner(System.in);
        t=sc.nextInt();
        while(t-->0)
        {
            n=sc.nextInt();
            int array[]=new int[n];
            for(int z=0;z<n;z++)
            {
                array[z]=sc.nextInt();
            }
            k=sc.nextInt()-1;
            int count=1;
            for(int z=0;z<n;z++)
            {
                if(array[z]<array[k])
                {
                    count++;
                }
            }
            System.out.println(count);

        }
    }
}
