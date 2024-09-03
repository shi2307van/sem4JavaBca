import java.util.*;

class sub
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    int n1,n2,res;
    
    System.out.print("Enter value of n1:");
    n1 = sc.nextInt();
    System.out.print("Enter value of n2:");
    n2 = sc.nextInt();
    
    res = n1 - n2;
    System.out.printf(" %d - %d = %d",n1,n2,res);
  }
}