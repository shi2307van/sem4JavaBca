import java.util.*;

class ArmstrongNo
{
  public static void main(String [] args)
  {
    Scanner sc = new Scanner(System.in);
    
    int no;
    int ans = 0,r =0,org_num;
    
    do
    {
      System.out.print("Enter the any positive number :-");
      no = sc.nextInt();
      if(no <= 0)
          System.out.println(" invalid number please Enter the only positive number.");
    }while(no <= 0);
    
     org_num = no;
    
    while(no > 0)
    {
      r = no%10;
      ans = ans +(r*r*r);
      no = no/10;
    }
    
    if(ans == org_num)
        System.out.println( " is armstrong number");
    else
        System.out.println( " is not armstrong number");
  }
}