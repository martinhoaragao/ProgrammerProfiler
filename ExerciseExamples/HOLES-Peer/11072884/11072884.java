import java.util.*;
class cc2
{
  public static void main(String args[])
   {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    String c = "ADROPQ";
   
    for(int i = 0; i < t; i++)
   {
 int x = 0;
     String s = sc.next();  
     for(int j = 0; j < s.length(); j++)
      {
        char ch = s.charAt(j);
        if(c.indexOf(ch) >= 0)
          { x++;}
        else if(ch == 'B') 
          {x=x+2;}
   }
System.out.println(x);
}
}
 }   
   
    
    