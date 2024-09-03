import java.util.*;

class CheckMultipal
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
      
     int n1,n2;
    
    System.out.print("Enter the value N1 :-");
     n1 = sc.nextInt();
    
    System.out.print("Enter the value N2 :-");
     n2 = sc.nextInt();
    if(n2 % n1 ==0)
      System.out.printf("%d is multiplal of %d",n1,n2);
    else
      System.out.printf("%d not is multiplal of %d",n1,n2);
  }
}