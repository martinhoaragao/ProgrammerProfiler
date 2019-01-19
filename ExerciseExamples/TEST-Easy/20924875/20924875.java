import java.util.Scanner;
class test{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int n=0;
while(n!=42){
n=sc.nextInt();
if(n!=42){System.out.println(n);}
else break;
}
}
}