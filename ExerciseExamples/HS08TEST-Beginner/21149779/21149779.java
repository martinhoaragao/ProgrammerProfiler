import java.util.Scanner;
import java.io.*;
class Main{
public static void main(String args[]){
            Scanner sc=new Scanner(System.in);
           
	   int aW=sc.nextInt();
	   float tA=sc.nextFloat();
	   // float temp=0;
	    if(aW>0 && aW+0.50<tA){
	    if(aW%5==0){
	     //   temp=(tA-aW)-0.50;
	         System.out.printf("%.2f",tA-(aW+0.50));
	    }else{
	         System.out.printf("%.2f",tA);
	    }
	   
	}else{
	    System.out.println(tA);
	    }
}
}