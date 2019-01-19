import java.util.*;
class double1{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=0;i<t;i++)
        {
            int p=sc.nextInt();
            if(p%2==0)
            System.out.println(p);
            else
            System.out.println(p-1);
        }
    }
}