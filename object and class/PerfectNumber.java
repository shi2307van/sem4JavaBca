import java.util.*;
class PerfectNumber
{
  int no,sum=0;
  
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
  void perfect_number()
  {
       for(int i=1; i<=no/2; i++)
       {
         if(no % i == 0)
          
           sum = sum + i;
       }
       if(sum == no)
         System.out.println(no +" is a perfect number.");  
       else
         System.out.println(no +" is not a perfect number.");  
  }
}