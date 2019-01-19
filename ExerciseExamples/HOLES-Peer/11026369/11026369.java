import java.util.Scanner;

/**
 *
 * @author BISHWESH
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int i,n,l,holes=0;
        
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        String[] s= new String[n];
        for(i=0;i<n;i++){
            s[i]=sc.next();
            l = s[i].length();
            while(l>0){
                if(s[i].charAt(l-1)=='A'||s[i].charAt(l-1)=='D'||s[i].charAt(l-1)=='O'||s[i].charAt(l-1)=='P'||s[i].charAt(l-1)=='Q'||s[i].charAt(l-1)=='R'){
                    holes++;
                }
                if(s[i].charAt(l-1)=='B'){
                    holes=holes+2;
                }
                l--;
            }
            
            System.out.println(holes);
            holes=0;
        }
        
        
        
    }
    
}