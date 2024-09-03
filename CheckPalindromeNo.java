import java.util.*;

class CheckPalindromeNo
{
 public static void main(String[] args)
 {
   Scanner in = new Scanner(System.in);
   
  System.out.print("Enter the any number :- ");
    int num = in.nextInt();
    int sum = 0,rev;
    int temp = num;
    while(num != 0)
    {
      rev=num%10;
      sum=(sum*10)+rev;
     num=num/10;
    }
    if(temp == sum)
 
      System.out.println("is palindrome number ");    
   else    
      System.out.println("is not a palindrome number ");
    
  }
}

//import java.util.Scanner;
//public class CheckPalindromeNo  {
//
//    public static void main(String args[])
//    {
//      Scanner in = new Scanner(System.in);
//          System.out.print("Input a number: ");
//          int n = in.nextInt();
//      int sum = 0, r;
//      int temp = n;    
//      while(n>0)
//      {    
//         r = n % 10;   
//          sum = (sum*10)+r;    
//         n = n/10;    
//      }    
//      if(temp==sum)    
//        System.out.println("It is a Palindrome number.");    
//      else    
//        System.out.println("Not a palindrome");    
//     }  
//}
