import java.util.Scanner;
class codechef{
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);

        int t=sc.nextInt();
        while(t>0){
            int n=sc.nextInt();
            int[] a=new int[n];

            for(int i=0;i<n;i++){
                a[i]=sc.nextInt();
            }
            int k=sc.nextInt();
            int search=a[k-1],temp=0;

            for(int i=0;i<n;i++){
                for(int j=0;j<n-1;j++){
                    if(a[j]>a[j+1]){
                        temp=a[j];
                        a[j]=a[j+1];
                        a[j+1]=temp;
                    }
                }
            }
            for(int i=0;i<n;i++){
                if(a[i]==search){
                    System.out.println(i+1);
                }
            }
            t--;
        }
    }
}