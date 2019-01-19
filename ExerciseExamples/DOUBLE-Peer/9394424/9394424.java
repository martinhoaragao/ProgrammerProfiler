import java.util.*;
import java.lang.*;
import java.io.*;
import java.math.*;

class S{
	public static void main(String args[]){
	Scanner sc = new Scanner(System.in);
	int t = sc.nextInt();
	while(t!=0){
	long n = sc.nextLong();
	if(n%2!=0)
		System.out.println(n-1);
	else
		System.out.println(n);
	t--;}
	}
}