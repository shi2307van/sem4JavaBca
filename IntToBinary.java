import java.util.*;

class IntToBinary
{
  static void decToBin(int n)
  {
    //Scanner sc = new Scanner(System.in);
    //n = sc.nextInt();
    int bin[] = new int[32];
    int i=0;
    while(n>0)
    {
      bin[i++] = n%2;
      n= n/2;
    }
    //System.out.printf("\n i wil be %d",i);
    for(i= i-1;i>=0;i--)
       System.out.print(bin[i]);
  }
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    int n;
    System.out.println("Enter value of n :- ");
    n = sc.nextInt();
    decToBin(n);
    
  }
}