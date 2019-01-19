import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

class c {
    public static void main(String[] args) throws IOException {
        try {
            int c=0;
            BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
             int t = Integer.parseInt(br.readLine());
            for (int i = 0; i < t; i++) {
                int count=0;
                String x=br.readLine();
                for (int j=0;j<x.length();j++){
                    count+=holes(x.charAt(j));
                }
                System.out.println(count);
            }


        } catch (Exception e) {
            return;
        }
    }

    public static int holes(char ch) {
               int c=0;
        if(ch=='A'||ch=='D'||ch=='O'||ch=='P'||ch=='Q'||ch=='R')
            c++;
        else if(ch=='B')
            c+=2;
        return c;
    }

}