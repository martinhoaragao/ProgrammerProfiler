import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        Scanner sc =  new Scanner(System.in);
        int t = sc.nextInt();
        while(t>0){
            String str = sc.next();    
            int count = 0;
            
            for(int i=0; i<str.length(); i++) {
                if(str.charAt(i) == 'A' || str.charAt(i) == 'D' || str.charAt(i) == 'O' || str.charAt(i) == 'P' || str.charAt(i) == 'Q' || str.charAt(i) == 'R')
                    count++;
                else if(str.charAt(i) == 'B')
                    count += 2;
            }
            System.out.println(count);
            
            t--;
        }
    }
}