
import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author prode
 */
public class Main {
    
	public static void main(String args[])throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int tests = Integer.parseInt(br.readLine());
		while(tests-->0){
			int n =Integer.parseInt(br.readLine());
			if(n%2==0)System.out.println(n);
			else System.out.println(n-1);
		}
	}
    
}
