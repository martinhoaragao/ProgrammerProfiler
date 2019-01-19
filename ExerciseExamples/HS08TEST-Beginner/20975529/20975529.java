import java.util.*;
class HS08TEST{
public static void main(String args[]){
Scanner obj=new Scanner(System.in);
double x=obj.nextDouble();
double s=obj.nextDouble();

if(x%5==0 && (x+0.50)<=s){
s=((s-x)-0.50);
System.out.printf("%.2f",s);
}
else
{

System.out.printf("%.2f",s);
}
}



}