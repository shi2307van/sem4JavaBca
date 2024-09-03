import java.util.*;
public class Constructor2
{
 //int count;
 Constructor2(int count)
 {
 System.out.println("Count=" + count);
 }
 public static void main(String[] args)
 {
   Scanner sc = new Scanner(System.in);
   int n;
   System.out.println("enter number");
   n = sc.nextInt();
 Constructor2 con = new Constructor2(n);
 }
}