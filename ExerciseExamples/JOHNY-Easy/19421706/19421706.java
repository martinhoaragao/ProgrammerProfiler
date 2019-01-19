
import java.util.*;
 class Solver {


    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int a[]=new int[n];
            for(int i=0;i<n;i++){
                a[i]=sc.nextInt();
            }
            int x=sc.nextInt();

            int val=a[x-1];
            Arrays.sort(a);
            int ans=0;
            for(int i=0;i<n;i++){
                if(a[i]==val){
                    ans=i+1;
                }
            }
            System.out.println(ans);
        }

    }
}
