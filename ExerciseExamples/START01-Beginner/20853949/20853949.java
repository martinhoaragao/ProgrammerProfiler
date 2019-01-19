import java.util.Scanner;

class Answer{
  int input;
  public Answer()
  {
    input = 0;
  }

  public void getInput()
  {
    Scanner in = new Scanner(System.in);
    input = in.nextInt();
    in.close();
  }

  public void display()
  {
    System.out.println(input);
  }
}

class Main {
  public static void main(String[] args) {
    Answer obj = new Answer();
    obj.getInput();
    obj.display(); 
  }
}