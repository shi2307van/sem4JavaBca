import java.util.*;

class ArmstrongNumber
{
  int no,ans = 0,r=0,org_num;
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
  void armstrong_num()
  {
    org_num = no;
     while(no > 0)
    {
      r = no%10;
      ans = ans + (r*r*r);
      no = no/10;
    }
    
    if(ans == org_num)
        System.out.println( " is armstrong number");
    else
        System.out.println(" is not armstrong number");
  }
}