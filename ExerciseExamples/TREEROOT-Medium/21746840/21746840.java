import java.util.Scanner;
class Solution{
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        int t=in.nextInt();
        
        while(t--!=0){
            int n=in.nextInt();
            
            int suma=0,sumb=0;
            for(int i=0;i<n;i++){
                suma+=in.nextInt();
                sumb+=in.nextInt();
            }
            
            System.out.println(suma-sumb);
        }
    }
}