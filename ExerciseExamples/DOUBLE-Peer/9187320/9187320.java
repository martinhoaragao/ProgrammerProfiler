import java.util.*;
 class JavaApplication1 {
    
    public static void main(String[] args) {
        
        Scanner in= new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++)
        {
           long n=in.nextLong();
           if(n%2!=0)
           {
              System.out.println(n-1); 
           }
           else if(n%2==0)
           {
              System.out.println(n);  
           }
           
        }
        
    }
}
