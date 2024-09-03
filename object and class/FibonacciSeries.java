import java.util.*;

class FibonacciSeries
{
  int num_terms;
  Scanner sc = new Scanner(System.in);
  void getData()
  {
    do
    {
      System.out.print("Enter any Number :-");
      num_terms = sc.nextInt();
      if( num_terms <=0)
        System.out.println("Invalid Input...Try Again!!!!");
    }while(num_terms<=0);
  }
  void display_series()
  {
    int t1 = -1,t2= 1,t3;
    for(int i=0;i<num_terms;i++)
    {
      t3 = t1+t2;
      t1 = t2;
      t2 = t3;
      System.out.println(t3 + "  ");
    }
  }
}