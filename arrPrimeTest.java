import java.util.*;

class arrPrimeTest
{
   static boolean isPrime(int n)
  {
     for(int i=2;i<=n/2;i++)
     {
       if(n%i==0)
         return false;
     }
     return true;
  }
   public static void main(String[] args)
   {
        Scanner sc = new Scanner(System.in);
        
        int n;
        
        do
        {
          System.out.println(" give the size of array");
          n = sc.nextInt();
        }while(n<3);
        
        int a[] = new int[n];
        
        for(int i=0;i<a.length;i++)
        {
          System.out.printf("\n a[%d] = ",i);
          a[i] = sc.nextInt();
        }
        System.out.println("my array \n ============\n"); 
         for(int x : a)
           System.out.printf("%5d",x);
        
         System.out.println("\n only prime number ...");
         
         for(int x :a)
         {
           if(isPrime(x))
           
            System.out.printf("\n%5d\n",x);
        }
   }
}
