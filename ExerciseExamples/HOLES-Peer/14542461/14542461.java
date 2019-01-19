import java.util.*;
class Holes
{
public static void main(String args[]) throws Exception
{
Scanner sc = new Scanner(System.in);
int t = sc.nextInt();
for(int i=1;i<=t;i++){
    String s=sc.next();
   char c[] = s.toCharArray();
   int hole = 0;
   for(int j=0;j<c.length;j++){
       if(c[j]== 'A' || c[j]== 'O' || c[j]== 'D' || c[j]== 'P' || c[j]== 'R'|| c[j]== 'Q'){
          hole++; 
   }
       if(c[j]== 'B'){
           hole = hole+2;
       }
      
}
    System.out.println(hole);
}
}}