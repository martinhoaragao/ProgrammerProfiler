import java.util.Scanner;
class DoubleStringCodechef {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int t = sc.nextInt();
        for(int i=0; i<t; i++)
        {
            int l =sc.nextInt();
            if(l%2!=0)
            {
                l-= 1;
            }
            System.out.println(l);
        }
    }
    
}
