import java.util.Scanner;
public class Main
{
    public static void main(String args[])
    {
    int i=1;
    
Scanner sc = new Scanner(System.in);
int a = sc.nextInt();

  
while(i<=a)
{
    int sum=0;
  String m = sc.next();
  for(int j=0;j<m.length();j++)
  {
      if(m.charAt(j)=='A' || m.charAt(j)=='D' || m.charAt(j)=='O' || m.charAt(j)=='P'||  m.charAt(j)=='Q' ||  m.charAt(j)=='R')
          sum++;
      else
          if( m.charAt(j)=='B')
              sum = sum+2;
  }
  System.out.println(sum);
   i++;
           
 
}
}
}