import java.util.*;

class StrongNo
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    
    int no ,i;
    int fact_n,lastdig;
    
        do
       {
         System.out.print("Enter the any positive number :-");
         no = sc.nextInt();
         if(no <= 0)
           System.out.println(" invalid number please Enter the only positive number.");
       }while(no <= 0);
       
       int total =0;
       int temp_n = no;
       
      while(no > 0)
      {
        i=1;
        fact_n =1;
        
        lastdig = no % 10;
        while(i <= lastdig)
        {
          fact_n = fact_n * i;
          i++;
        }
        total = total + fact_n;
        no = no / 10;
      }
      if(total == temp_n)
        System.out.println(temp_n + "is strong number");
     else
         System.out.println(temp_n + "is not strong number");
  }
}