import java.io.*;
import java.util.Scanner;
 
class calc{
	long sum = 0;
	public long done(long t,long x,long y,long z){
		//System.out.prlongln(x+" "+y+" "+z);
		//if((x+y+z)>t){
		if(t>11){
			x = done(x,x/2,x/3,x/4);
			y = done(y,y/2,y/3,y/4);
			z = done(z,z/2,z/3,z/4);
			//System.out.prlongln(x+" "+y+" "+z+" "+sum);
			sum=x+y+z;
			//System.out.prlongln(x+"new"+y+" "+z+" "+sum);
		}
		else{
			sum = t;
			//System.out.prlongln("puting:  "+sum);
		}
		return sum;
 
	}
}
 
class gc{
	public static void main(String []args){
		
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
		long t = sc.nextLong();
		calc n = new calc();
		long x,y,z;
		x=t/2;
		y=t/3;
		z=t/4;
		long k = n.done(t,x,y,z);
		System.out.println(k);
	}
	}
} 