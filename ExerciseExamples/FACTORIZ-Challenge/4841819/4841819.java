     import java.math.*;
    import java.util.Scanner;
    class factor {
    public static void main(String[] args){
    Scanner q= new Scanner(System.in);
    BigInteger n,i,fact,pch;
    pch=new BigInteger("0");
    long p,m,f,end;
    int j,k,x;
    boolean flag,flag1;
    flag=false;
    long b[] =new long[50005];
    p =q.nextLong();
    BigInteger a[] =new BigInteger[50005];
    a[0]=new BigInteger("2");
    fact=new BigInteger("0");
    k=1;
    for(f=3;f<7920;f++){
    i=BigInteger.valueOf(f);
    if(i.isProbablePrime(2)){
    a[k++]=i;
    }
    }
    x=k;
    while(p-- !=0){
    flag=false;
    flag1=false;
    n=q.nextBigInteger();
    long sum;
    sum=end=0;
    for(j=0;j<1000;j++)
    b[j]=0;
    for(j=0; j<x && a[j].compareTo(n) !=1;j++){
    while((n.remainder(a[j])).equals(BigInteger.ZERO)){
    flag1=true;
    b[j]++;
    n=n.divide(a[j]);
    sum++;
    fact=n;
    k=j;
    }
    }
    if(fact.compareTo(BigInteger.ONE)!=0){
    pch=fact;
    sum++;
    flag=true;
    }
    if(flag1){
    System.out.println(sum);
    for(j=0;j<=k;j++){
    while(b[j]>0){
    System.out.print(a[j]);
    b[j]--;
    if(j==k && b[j]==0)
    break;
    else
    System.out.print(" ");
    }
    }
    if(flag)
    System.out.print(" " + pch);
    System.out.println("\n");
    }
    else
    System.out.println("1\n" + n);
    }
    }
    } 