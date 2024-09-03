import java.util.*;

class ReverseNo
{
  public static void main(String[] args)
  {
    Scanner in = new Scanner(System.in);
    
    int num,rev=0;
    
    System.out.println("Enter The Any Number :-");
    num = in.nextInt();
    
    while(num != 0)
    {
      int rem = num % 10;
      rev = rev * 10 + rem;
      num = num / 10;
    }
    
    //System.out.printf(" The %d reverse value of :- %d ",num,rev);
    System.out.println("The reverse of the given number is: " + rev);

  }
}