import java.util.Scanner;

public class Main{
public static void main(String args[]){
int num;
Scanner d=new Scanner(System.in);

while(true){
num=d.nextInt();
if(num!=42)
System.out.println(num);

else
System.exit(0);

}
}
}