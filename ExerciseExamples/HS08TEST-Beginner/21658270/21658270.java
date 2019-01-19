import java.util.Scanner;
 class Ex{

public static void main(String args[]){
Scanner s= new Scanner(System.in);
double a=0.50;


double x=s.nextInt();
double y=s.nextDouble();
if((x<=2000 && x>=0)&&(y>=0 && y<=2000)&&(y>=x+.5 && x%5==0))
{double cv=y-(x+.5);
System.out.printf("%.2f",cv);}
else{
System.out.printf("%2f",y);}



}}