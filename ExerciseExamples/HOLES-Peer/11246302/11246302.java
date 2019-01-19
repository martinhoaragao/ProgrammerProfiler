import java.util.Arrays;
import java.util.Scanner;
public class Main {
public static void main(String[] args){
Scanner in = new Scanner(System.in);
int t = 0;
String s = in.nextLine();
t = Integer.parseInt(s);
for (int j = 0; j < t; j++) {
    int sum =0;
    s = in.nextLine();
    int len = s.length();
    char arr[] = s.toCharArray();
    for (int i = 0; i < len; i++) {
        if(arr[i]=='A' || arr[i]=='D' || arr[i]=='O' || arr[i]=='P' || arr[i]=='Q' || arr[i]=='R')sum++;
        else if(arr[i]=='B')sum+=2;
    }
    System.out.println(sum);
}
}
}