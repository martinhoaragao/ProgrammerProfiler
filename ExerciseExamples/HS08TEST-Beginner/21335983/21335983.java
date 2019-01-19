import java.util.*;
class atm
{
	public static void main(String args[])
	{
		Scanner br=new Scanner(System.in);
		int x;
		double y=0;
		double z=0.5;
		x=br.nextInt();
		y=br.nextDouble();
		if(x%5==0)
     {
         double wr = x+ z;
         if(wr<= y)
         {
System.out.println(y-wr);
}
         else {
   System.out.println(y);}
}
else{
System.out.println(y);
}}}