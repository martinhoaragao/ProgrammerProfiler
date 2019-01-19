import java.util.*;

class Codechef{
    public static void main(String[] args){
        try{
            Scanner sc=new Scanner(System.in);
            int t=sc.nextInt();
            int fpos=-1;
            for(int i=0;i<t;i++)
            {
                int n=sc.nextInt();
                int[] ar=new int[n];
                for(int j=0;j<n;j++)
                {
                    ar[j]=sc.nextInt();
                    
                }
                int k=sc.nextInt();
                int pos=ar[k-1];
                Arrays.sort(ar);
                for(int j=0;j<n;j++)
                {
                    if(ar[j]==pos){
                    fpos=j+1;
                    break;}
                }
                System.out.println(fpos);
            }
        }
        catch(Exception e){
            return;
        }
    }
}