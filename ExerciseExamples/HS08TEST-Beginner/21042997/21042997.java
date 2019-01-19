import java.util.*;
class ATM {
public static void main(String arg[]){
Scanner sc=new Scanner(System.in);
double y;
int x=sc.nextInt();
y=sc.nextDouble();

if((x%5==0) && x<(y-0.50)){
y=y-(x+0.50);
}
System.out.printf(String.format("%.2f",y));

}
}