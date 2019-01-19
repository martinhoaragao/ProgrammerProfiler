import java.util.*;
public class Main{
public static void main(String[] args){
Scanner scan = new Scanner(System.in);
while(scan.hasNext()){
String answer = scan.next();
if(answer.equals("42"))
break;
else
System.out.println(answer);
}
}
}