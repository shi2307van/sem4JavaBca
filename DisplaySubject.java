
class DisplaySubject
{
  public static void main(String[] args)
  {
    System.out.printf(" The display 1 to 100 ");
    
    for(int i=1; i<=100 ;i++)
    {
        System.out.println(i);
       if((i%3 & i%4) == 0)
          System.out.println("\n web desing");
       else if(i%3 == 0)
          System.out.println("\n java ");
       else if(i%4 == 0)
         System.out.println("\n .net");
       else
           System.out.printf("\n %d ",i);
    }
  }
}