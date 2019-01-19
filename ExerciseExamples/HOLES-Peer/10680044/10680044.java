import java.util.*;

class holes
{
  
   public static void main(String args[])
   {
      Scanner sc=new Scanner(System.in);
      int t=sc.nextInt();
      
          while( t-- >=1)
          {
              int c=0;
          String s=sc.next();
          int l=s.length();
         
          for(int i=0;i<l;i++)
          {
              char z=s.charAt(i);
              if(z=='A'||z=='D'||z=='O'||z=='P'||z=='R'||z=='Q')
              {
                  c++;
                }
              if(z=='B')
              {
                  c=c+2;
                }
            }
            System.out.println(c);
                  
        
    
   
   }

}
}
  
 
 