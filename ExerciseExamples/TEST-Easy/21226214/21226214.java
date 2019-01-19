import java.io.*;
class Test {
 public static void main(String args[])
  throws IOException{
  DataInputStream in=new DataInputStream(System.in);
  int num;
  num=Integer.parseInt(in.readLine());
  while(num!=42){
      System.out.println(+num);
  num=Integer.parseInt(in.readLine());}
  }
 }