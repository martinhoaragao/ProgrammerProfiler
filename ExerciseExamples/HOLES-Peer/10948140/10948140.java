import java.util.Scanner;
public class Main{
  public static void main(String[] args){
    int t,n,x;
    char ch;
    Scanner sc=new Scanner(System.in);
    t=Integer.parseInt(sc.nextLine());  
    while(t!=0){
      t--;
      x=0;
      String s=sc.nextLine();
      for(int i=0,l=s.length();i<l;i++){
        ch=s.charAt(i);
        if(ch=='A'||ch=='D'||ch=='O'||ch=='P'||ch=='Q'||ch=='R'){
          x++;
        }
        if(ch=='B')
          x+=2;
      }
      System.out.println(x);
    }
  }
}
