import java.awt.*;
import java.awt.event.*;
import java.awt.geom.*;
import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;

public class Main {
	public static void main(String [] Orange) throws Exception {
		Scanner sc = new Scanner(System.in);
		int tests = sc.nextInt();
		while (tests-- > 0) {
		    int sums = 0;
		    int n = sc.nextInt();
		    for (int i = 0; i < n; i ++) {
		    	sums += sc.nextInt() - sc.nextInt();
		    }
		    System.out.println(sums);
		}
	}
}