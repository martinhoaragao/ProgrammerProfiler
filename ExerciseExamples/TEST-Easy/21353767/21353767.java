import java.util.Scanner;
public class Main{
public static void main(String[] args){
int num;
Scanner s=new Scanner(System.in);
while (true) {
num=s.nextInt();
if(num!=42)
System.out.println(num);
else
break;
}
}

}

