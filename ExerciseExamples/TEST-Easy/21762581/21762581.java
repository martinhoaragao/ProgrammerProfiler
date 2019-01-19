import java.io.*;
import java.util.Scanner;
class Sample
{public static void main(String args[])
{int num;
Scanner s=new Scanner(System.in);
num=s.nextInt();
while(num!=42)
{System.out.println(+num);
num=s.nextInt();}}}


