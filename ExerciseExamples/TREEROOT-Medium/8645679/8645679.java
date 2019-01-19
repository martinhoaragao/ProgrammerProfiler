import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
 static 


	
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	PrintWriter pw = new PrintWriter(System.out);
	static int n =0;
 public static void main(String[] args) throws NumberFormatException,
			IOException {

//	Scanner s=new Scanner(System.in);
	n=Integer.parseInt(br.readLine());
	int n1=0;
	while(n-->0){
		int num3=0;
		n1=Integer.parseInt(br.readLine());
		//int [] [] arr=new int [n1][2];
		while(n1-->0){
		String a=br.readLine();
		String [] num=a.split(" ");
		int num1=Integer.parseInt(num[0]);
		int num2=Integer.parseInt(num[1]);
		
		num3+=num1-num2;
		//String ans;
		//output(num1,num2);
		}
		System.out.println(num3);
	}
	}
	
	
	
	}