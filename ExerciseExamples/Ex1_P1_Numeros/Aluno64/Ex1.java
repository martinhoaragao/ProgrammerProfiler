import java.util.Scanner;

public class Ex1
{ public static void main(String [] args){
    int n=-1,np=0,ni=0,ntp=0;
    Scanner ler = new Scanner(System.in);
    System.out.println("começa");
    while(true){
    n=ler.nextInt();
    if(n==0) break;
        else if(n%2==0) {np++; ntp+=n;}
        else ni++;
    }
 System.out.println("Números pares: "+np+"\nNúmeros impares: "+ni+"\nMédia dos pares: "+(ntp/np));
}
}