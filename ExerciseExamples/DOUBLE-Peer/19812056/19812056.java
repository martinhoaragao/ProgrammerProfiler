import java.util.Scanner;



 class JavaApplication19 {

   
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in); 
       
        int T = sc.nextInt();  
        sc.nextLine();
        for(int i=1;i<=T;i++){
            
            int n =sc.nextInt();
            if(n%2==0)System.out.println(n);
            if(n%2!=0)System.out.println(n-1);
            
        }
        }
        }