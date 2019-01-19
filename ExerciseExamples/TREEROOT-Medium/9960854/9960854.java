/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
		Scanner k = new Scanner(System.in);
 
			int test = k.nextInt();
 
			while (test-- > 0) {
				int n = k.nextInt();
				
				int root = 0;
				
				for (int i = 0; i < n; i++) {
					int id = k.nextInt();
					int sid = k.nextInt();
					root = root + id - sid;
				}
				System.out.println(root);
			}
 
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
 
}
 
