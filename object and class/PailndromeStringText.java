import java.util.*;
class PailndromeStringText
{
  String str;
  void getData()
  {
    do
    {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter Any String :-");
      str = sc.nextLine();
    }while(str.trim().length()==0);
  }
  void check_palindrome()
  {
    String rev_str = "";
    for(int i= str.length()-1;i>=0;i--)
    {
      rev_str= rev_str +str.charAt(i);
    }
    if(rev_str.equals(str))
      System.out.println("Inputed String Is \" Palindrome\" ");
    else
      System.out.println("Inputed String Is \" Palindrome\" ");
  }
}