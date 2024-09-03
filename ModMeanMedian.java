//import java.util.*;

class ModMeanMedian
{
  static double findMean(int a[],int n)
  {
    int sum = 0;
    for(int i=0;i<n;i++)
      sum = sum + a[i];
    return (double)sum/(double)n;
  }
  public static void main(String[] args)
  {
    int a[] = {1,2,3,4,5,5,6,7,8};
    int n = a.length;
    System.out.println("\n Find Mean := " +findMean(a,n));
  }
}