 
import java.util.Scanner;
 
 class DoubleString {
    
    public static void main(String args[])
    {
        int t;
        Scanner s=new Scanner(System.in);
        t=s.nextInt();
        while(t--!=0)
        {
            int n;
            n=s.nextInt();
            if(n%2==0) System.out.println(""+n);
            else System.out.println(""+(n-1));
            
        }
        
        
    }
}