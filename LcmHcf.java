import java.util.*;

class LcmHcf
{
  static boolean isPrime(int n1,int n2)
  {
     for(int i=2;i<=n1/2;i++)
     {
       if(n1%i==0)
         return false;
     }
     return true;
  }
  static int hcf(int n1,int n2)
  {
    int i;
    if(isPrime(n1,n2)){
    }
    else if(n1%n2 == 0 || n2%n1 == 0) 
    {
      return Math.min(n1,n2);
    }
    else
    {
      for(i=Math.min(n1,n2);i>=1;i--)
      {
        if(n1%i==0 && n2%i==0)
          return i;
      }
    }
    return n1;
  }
  static int lcm(int n1,int n2)
  {
    return (n1 * n2)/hcf(n1,n2);
  }
  public static void main(String[] args)
  {
    Scanner in = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int n1 = in.nextInt();
        System.out.print("Enter second number: ");
        int n2 = in.nextInt();
        System.out.printf("\n HCF  of %d and %d = %d" ,n1,n2,hcf(n1,n2));
        System.out.printf("\n LCM = of %d and %d = %d" ,n1,n2,lcm(n1,n2));
  }
}