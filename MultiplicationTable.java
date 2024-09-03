import java.util.*;

class MultiplicationTable{
    public static void main(String[] args)
    {
      Scanner sc = new Scanner(System.in);
     
      System.out.print("enter any number : ");
     
      int num = sc.nextInt();
     
      for(int i=1;i<=10;i++)
      {
        System.out.printf("%d *%d = %d\n",num ,i,(num*i));
      }
    }
}
