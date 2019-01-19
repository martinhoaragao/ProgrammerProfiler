import java.io.*;
import java.util.*;

public class Main{
public static void main(String args[])
{
Scanner in = new Scanner(System.in);

for(int i=0;i<100000;i++)
{
int n = in.nextInt();
if(n==42)
break;
System.out.println(n);

}
}
}