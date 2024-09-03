// write a program odd even number....
import java.util.*;

class oddeven
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    int n1;
    System.out.print("Enter your number :");
    n1 = sc.nextInt();
    if(n1%2 == 0)
      System.out.print("your enter number is "+n1+"even .....");
    else
      System.out.print("your enter number is "+n1+ "odd....");
  }
}