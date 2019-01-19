import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int t= keyboard.nextInt();
        int IdxToFind;
        for(int i=0;i<t; i++)
        {
            int n= keyboard.nextInt();
            int s[]= new int[n+1];
            for(int j=1;j<=n;j++)
            {
                s[j]=keyboard.nextInt();
            }
            int k = keyboard.nextInt();
            IdxToFind=s[k]; 
            Arrays.sort(s);
            for(int m=1;m<=n;m++)
            {
                if(s[m]==IdxToFind) {
                    System.out.println(m);
                    continue;
                }
            }
        }
    }
    }

