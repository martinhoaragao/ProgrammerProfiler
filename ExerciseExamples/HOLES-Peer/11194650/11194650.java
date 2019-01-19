import java.util.*;
class xxx
{
    public static void main(String args[])
    {
     Scanner sc=new Scanner(System.in);
     int T= sc.nextInt();
     String word;
     int count,i,j;
     for(i=1;i<=T;i++)
      {
       count=0;   
       word=sc.next();
       for(j=0;j<word.length();j++)
       {
         if(word.charAt(j)=='A'||word.charAt(j)=='D'||word.charAt(j)=='O'||word.charAt(j)=='P'||word.charAt(j)=='R'||word.charAt(j)=='Q')
          count++;
         else if(word.charAt(j)=='B')
          count=count+2;
        }
       System.out.println(count); 
        }
    }
}