import java.util.Scanner;


public class ex4 {
 public static int subCadeias(String N, String M){
     int i, j=0, p=0, l, total=0;
     int cN = N.length();
     int cM = M.length();
     for(i=0 ;i<cN;i++){
        
        if(M.charAt(p) == N.charAt(i)){
            j=i;
            for(l=0;l<cM;l++){
            if(j>=cN){break;}    
            if(M.charAt(p) == N.charAt(j)){
            j++;
            p++;
            }
            }
        }
        
        if(p==M.length()){total+= 1;}
        p=0;
    }
    return total;
 }
 
 public static void main (String[] args){
    String N,M;
    int conta;
    Scanner input = new Scanner(System.in);
    System.out.println("Intruduza a primeira string: ");
    N=input.nextLine();
    System.out.println("Intruduza a subcadeia string: ");
    M=input.nextLine();
    conta=subCadeias(N,M);
    System.out.println("Tem " + conta +" subcadeias");
    
    }
 
 
}