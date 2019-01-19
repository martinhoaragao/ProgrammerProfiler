import java.util.Scanner;
class lifeUniverseEverything
{
  public static void main(String[] args)
  { 
    Scanner sc=new Scanner(System.in);
	boolean b=true;
	while(b)
	{ 
	  int n=sc.nextInt();
	  if(n!=42)
	  System.out.println(n);
	  else
	  {b=false;}
	}
  }
}