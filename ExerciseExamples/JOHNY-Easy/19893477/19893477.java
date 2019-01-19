import java.util.Arrays;
import java.util.Scanner;
public class Main {
    public static void main(String []args){
        int n,k,d,ab;
        Scanner sc = new Scanner (System.in);
        int t = sc.nextInt();
        for (ab=1; ab<=t; ab++){
            n = sc.nextInt();
            int[] a = new int[n];
            for (int i=0; i<a.length; i++){
                a[i] = sc.nextInt();
                
            }
            k = sc.nextInt();
           d = a[k-1];
           Arrays.sort(a);
            for (int i=0; i<a.length; i++){
                if (a[i]==d){
                    System.out.println(i+1);
                }
            } 
            
           }
           
            }
        }
    

