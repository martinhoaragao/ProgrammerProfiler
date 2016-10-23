import java.util.Scanner;
public class ex4
{
 public static void initex4() {
     Scanner s = new Scanner(System.in);
     String nova;
     String mini;
     int i,j,aux,conta,sub;
     System.out.println("Insira a sua String:");
     nova = s.nextLine();
     System.out.println("INsira a substring:");
     mini = s.nextLine();
     conta = 0;
     sub = 0;
     for(i = 0;i<=nova.length()-mini.length();i++) {
         aux = i;
         for(j=0;j<mini.length();j++){
             
             if(mini.charAt(j) == nova.charAt(aux)) conta++;
             
             System.out.println("conta:"+conta+"mini:"+mini.charAt(j)+"grande:"+nova.charAt(aux));
             aux++;
         }
         if(conta == mini.length()) sub++;
         System.out.println("sub"+sub);
         conta = 0;
     }
     System.out.println("NºStrings:"+sub);
 }   
}
