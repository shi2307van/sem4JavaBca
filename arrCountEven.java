import java.util.*;

class arrCountEven
{
  static boolean isEven(int x)
  {
    if(x % 2 == 0)
      return true;
    else 
      return false;
  }
  public static void main(String[] args)
  { 
    Scanner sc = new Scanner(System.in);
    
    int arr[] = new int[10];
    
    for( int i=0;i<arr.length;i++)   
    {
      System.out.printf("arr[%d] = ?",i);
      arr[i]= sc.nextInt();
    }
    int est = 0;
    
    for(int a:arr)
    
      if(isEven(a))
    
    est++;
    
    System.out.println("\n======== my Array =====\n");
    
    for(int a:arr)
    
      System.out.printf("%5d",a);
    
    System.out.printf("\n there are %d even numbers",est);
  }
}