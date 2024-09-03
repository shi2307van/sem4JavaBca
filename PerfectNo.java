import java.util.*;

class PerfectNo
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
     int no,sum = 0;
     
       do
       {
         System.out.print("Enter the any positive number :-");
         no = sc.nextInt();
         if(no <= 0)
           System.out.println(" invalid number please Enter the only positive number.");
       }while(no <= 0);
     
       for(int i=1; i<=no/2; i++)
       {
         if(no % i == 0)
          
           sum = sum + i ;
       }
       if(sum == no)
         System.out.println(no +" is a perfect number.");  
       else
         System.out.println(no +" is not a perfect number.");  
  }
}