import java.util.*;

class FindFactor
{
  public static void main(String[] args)
  {
 
  Scanner sc = new Scanner(System.in);
 
  int i,n;
 
  System.out.print("you wamt to find the factors of which number : ");
 
  n = sc.nextInt();
 
  System.out.printf("factor of %d",n);
 
  System.out.println("\n=============\n");
 
  System.out.printf("%d ",1);
   
  for(i =2;i<=n/2;i++)
  {
    if(n%i==0)
    {
      System.out.printf("%.3d"," ",i);
    }
  }
 System.out.printf("%d ",n);
 
}

}
