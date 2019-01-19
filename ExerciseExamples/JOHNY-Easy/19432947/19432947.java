import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
class S {
    public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int t=sc.nextInt();
	while(t-->0)
	{    int n=sc.nextInt();
	     ArrayList<Integer> ac=new ArrayList<Integer>();
	     ArrayList<Integer> ac2=new ArrayList<Integer>();
	     for(int i=0;i<n;i++)
		 ac.add(sc.nextInt());ac2= (ArrayList<Integer>)ac.clone();
		 Collections.sort(ac);
		 System.out.println((ac.indexOf(ac2.get(sc.nextInt()-1))+1));
	}}}
			
