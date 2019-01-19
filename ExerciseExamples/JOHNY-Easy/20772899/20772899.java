import java.io.*;
import java.util.*;
class johny{
public static void main(String args[]){
int a[]=new int[100];
Scanner s=new Scanner(System.in);
int n=s.nextInt();
for(int i=0;i<n;i++){
int nos=s.nextInt();
for(int j=0;j<nos;j++){
a[j]=s.nextInt();
}




int pos=s.nextInt();
int john=a[pos-1];
//System.out.println(john);
//System.out.println();
for(int j=0;j<nos;j++){
for(int k=j;k<nos;k++){
if(a[j]>a[k]){
int temp=a[j];
a[j]=a[k];
a[k]=temp;
}
}
}

//for(int j=0;j<nos;j++){
//System.out.println(a[j]);}

for(int j=0;j<nos;j++){
//System.out.println(a[j]);
if(a[j]==john) {System.out.println(new Integer(j+1));}
}

}
}
}