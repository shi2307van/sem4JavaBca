import java.util.*;
 
class MatrixOperationUDF
{
  static int add(int a[][],int b[][])
  {
    int i,j;
    int c[][] = new int[a.length][a[0].length];
    for( i=0;i<a.length;i++)
    {
      for( j=0;j<a[i].length;j++)
      {
        c[i][j] = a[i][j]+b[i][j];
       
      }
    }
    return c[i][j];
  }
   static int sub(int a[][],int b[][])
  {
    int c[][] = new int[a.length][a[0].length];
    for(int i=0;i<a.length;i++)
    {
      for(int j=0;j<a[i].length;j++)
      {
        c[i][j] = a[i][j]-b[i][j];
      }
    }
  }
   public static void main(String[] args)
   {
     Scanner sc = new Scanner(System.in);
     int r,c,i,j;
     System.out.println("Enter rows and columns of the matrix respectively : - ");
     r = sc.nextInt();
     c = sc.nextInt();
     
     int a[][] = new int[r][c];
     int b[][] = new int[r][c];
     System.out.println("\n Input for Matrix a :-");
     for(i=0;i<r;i++)
     {
       for(j=0;j<c;j++)
       {
           System.out.printf("a[%d][%d]=",i,j);
           a[i][j] = sc.nextInt();
       }
     }
     System.out.println("\n Input for Matrix b :-");
     for(i=0;i<r;i++)
     {
       for(j=0;j<c;j++)
       {
           System.out.printf("a[%d][%d]=",i,j);
           b[i][j] = sc.nextInt();
       }
     }
     System.out.printf("\n ==== Matrix B ======\n");
     for(i=0;i<r;i++)
     {
        for(j=0;j<c;j++)
        {
           System.out.printf("%d",b[i][j]);
        }
         System.out.printf("\n");
     }
     int d[][] = new int[r][c];
     d = add(a,b);
     d = sub(a,b);
   }
}