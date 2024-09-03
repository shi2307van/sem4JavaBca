import java.util.*;

class PrimeNumber
{
  int no;
  int temp;
  boolean isPrime=true;
  void getData()
  {
    do
    {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter Any Valid Number :-");
      no = sc.nextInt();
      if(no<0)
        System.out.println("Sorry ,Please Enter Valid Number!!!!!");
    }while(no<0);
  }
  void prime_number()
  {
     for(int i=2;i<=no/2;i++)
     {
       temp=no%i;
   
       if(temp==0)
       {
         isPrime=false;
         break;
       }
     }
     //If isPrime is true then the number is prime else not
     if(isPrime)
         System.out.println(no + " is a Prime Number");
     else
        System.out.println(no + " is not a Prime Number");
   }
  
}