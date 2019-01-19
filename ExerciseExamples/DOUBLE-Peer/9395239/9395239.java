/**
 * Created by Yasha on 12-02-2016.
 */
import java.io.*;
import java.util.*;
import java.math.*;
import java.lang.*;

 class Codechef {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        int t = in.nextInt();
        for (int i = 0; i <t ; i++) {


            int l = in.nextInt();
            int len = 0;
            if (l % 2 == 0)
                len = l;
            else
                len = l - 1;
            System.out.println(len);
        }
    }
}
