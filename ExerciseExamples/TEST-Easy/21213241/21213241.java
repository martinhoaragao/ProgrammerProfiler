import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main{
public static void main(String[] args) throws IOException{
 BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
ArrayList<Integer> al = new ArrayList<Integer>();
 while(true){
 	int n=Integer.parseInt(br.readLine());
 	if(n==42)
 	break;
 	al.add(n);
 	}
 	for(int i=0;i<al.size();i++)
 	System.out.println(al.get(i));
   }
 }