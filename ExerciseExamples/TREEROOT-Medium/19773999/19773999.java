import java.util.Scanner;

class TREEROOT {
     public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t!=0){
            int n=sc.nextInt();
            int id=0;
            int sum=0;
            for(int i=0;i<n;i++){
                int temp1=sc.nextInt();
                int temp2=sc.nextInt();
                sum+=(temp1-temp2);
                    }
            System.out.println(sum);  
            t--;}
            }
        }
       
    


