import java.util.*;

class PrimeOnly 
{  
  static boolean isPrime(int n)
  {
     for(int i=2;i<=n/2;i++)
     {
       if(n%i==0)
         return false;
     }
     return true;
  }
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
      int n;
    
    System.out.print("Enter any number :");
      n =sc.nextInt();
   
    if(isPrime(n))
       System.out.printf(" %d is prime no",n);
     else
       System.out.printf("%d is not a prime no",n);
  }
} 