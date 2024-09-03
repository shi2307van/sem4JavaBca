import java.util.*;

class MeanMedianMod
{
  // average of array  ...
   static double mean(double[] m) 
   {
     double sum = 0;
     for (int i = 0; i < m.length; i++) 
     {
       sum += m[i];
     }
     return sum / m.length;
   }
   // middle value of array ......
   static double median(double[] m) 
   {
     int middle = m.length/2;
     if (m.length%2 == 1) 
     {
       return m[middle];
     }
     else 
     {
       return (m[middle-1] + m[middle]) / 2.0;
     }
   }
   // most repeated value in array....
   static double mode(double[] m) 
   {
     double maxValue = 0, maxCount = 0;

     for (int i = 0; i < m.length; ++i) 
     {
       int count = 0;
       for (int j = 0; j < m.length; ++j)
       {
         if (m[j] == m[i]) ++count;
       }
       if (count > maxCount) 
       {
         maxCount = count;
         maxValue = m[i];
       }
     }
     return maxValue;
   }
   public static void main(String[] args)
   {
     Scanner sc = new Scanner(System.in);
     int n=0;
     System.out.println("Enter The Value N :-");
     n = sc.nextInt();
     double a[] = new double[n];
       for(int i=0;i<a.length;i++)
       {
         System.out.printf("\n a[%d] = ",i);
         a[i] = sc.nextInt();
       }
        System.out.println("\n Find Mean := " + mean(a));
        System.out.println("\n Find Median := " + median(a));
        System.out.println("\n Find Mode := " + mode(a));
   }
}