import java.util.*;
import java.math.*;
class sol2{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
      int n=s.nextInt();
      s.nextLine();
      for(int i=0;i<n;i++)
      {
          String a=s.nextLine();
          int holes=0;
          for(int j=0;j<a.length();j++)
          {
              if(a.charAt(j)=='A'||a.charAt(j)=='D'||a.charAt(j)=='O'||a.charAt(j)=='P'||a.charAt(j)=='Q'||a.charAt(j)=='R')
                 holes++;
              else if(a.charAt(j)=='B')
                  holes=holes+2;
              else continue;
              
          
          }
          System.out.println(holes);
      
      }
    
    }

}