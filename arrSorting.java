import java.util.*;

class arrSorting
{
  static int[] sort(int x[])
  {
    for(int i=0;i<x.length;i++)
    {
      for(int j=0;j<x.length;j++)
      {
        if(x[i]>x[j]);
        {
          int temp = x[i];
          x[i] = x[j];
          x[j]= temp;
        }
      }
    }
    return x;
  }
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    
    int n=0;
   System.out.print("Enter value of N :-");
   
   int a[] = new int[n];
   
   for(int i=0;i<a.length;i++)
   {
     System.out.printf("\n a[%d] = ",i);
     a[i] = sc.nextInt();
   }
     System.out.printf("\n unsorted array \n");
      for(int x:a)
          System.out.printf("%5d",x);
    
    System.out.printf("\n only sorted array \n");
  }
}