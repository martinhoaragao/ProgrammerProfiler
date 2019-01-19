import java.io.BufferedReader;
import java.util.*;
import java.io.*;
public class Main {

    public static void main(String[] args)throws IOException {
        
        String str;
        int min,t=40,count;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        str=br.readLine();
        min=Integer.parseInt(str);
        if(min<=t){
        t=min;
        
        String a[]=new String[t];
        
        for(int i=0;i<t;i++){
            count=0;
        a[i]=br.readLine();
        char b[]=a[i].toCharArray();
        int l=a[i].length();
        for(int j=0;j<l;j++){
        if(b[j]=='A' || b[j]=='D' || b[j]=='O' || b[j]=='P' || b[j]=='Q' || b[j]=='R'){
        count=count+1;
        }
        else if(b[j]=='B'){
        count=count+2;
        }
        }
        System.out.println(count);
        }
        
    }
    
}
}