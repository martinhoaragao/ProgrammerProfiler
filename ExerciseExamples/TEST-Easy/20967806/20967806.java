import java.util.*;
public class Main
{
public static void main(String args[])
{
Scanner in = new Scanner(System.in);
List<Integer> arr = new ArrayList<>();
while(true)
{
int n=in.nextInt();
if(n==42)
{
break;
}
else
{
arr.add(n);
}
}
Iterator itr=arr.iterator();
while(itr.hasNext())
System.out.println(itr.next());
}
}