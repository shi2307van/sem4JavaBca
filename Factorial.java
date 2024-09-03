import java .util.*;

class Factorial
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
   
    int n;
    long res =1;
   
    do{
      System.out.print("enter value of n:");
      n= sc.nextInt();
     
      if(n<0)
        System.out.println("\n please enter correct number ");
    }while(n<0);
   
    for(int i=2;i<=n;i++)
    {
      res *= i;
    }
    System.out.printf("%d! = %d ",n , res );
  }
}
