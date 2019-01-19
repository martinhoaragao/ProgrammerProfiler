
import java.util.*; 
class Test{
public static void main(String[] args) 
{
    Scanner sc=new Scanner(System.in);
   int x=sc.nextInt();
   double y=sc.nextFloat();
   if(x+0.50<y)
   {
        if(x%5==0)
         {
	        y=y-((float)x+0.50);
        	System.out.println(y);
          }
        else
         {
	   System.out.println(y);
          }
   }
   else
	   System.out.println(y);
}
}