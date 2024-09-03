/*import java.util.*;

class StudentInfo
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    
      int n ;
      do
      {
        System.out.print("Enter array size :-");
        n=sc.nextInt();
        if(n<=0)
        
           System.out.printf("\n oopss!!!!!! Array size invalid please try again \n ");
        
      }while(n<=0);
      
    String name[] = new String[n];
    
    for(int i=0;i<name.length;i++)
    {
      System.out.printf("\n Student Name %d = ",i+1);
      name[i] = sc.nextLine().toUpperCase().trim();
    }
     System.out.printf("\n all the student \n ");
     
     int cnt = 0;
     
    for(String sname:name)
    {
       System.out.printf("\n %s \n ",sname);
       
       if(sname.charAt(0) == 'H')
         cnt++ ;
    }
    if(cnt>0)
    {
      for(String sname:name)
      {
         if(sname.charAt(0) == 'H')
            System.out.printf("\n %s \n ",sname);
      }
    }
    else
       System.out.printf("There are %d student whose name start with \'H\'",cnt);
  }
}
*/
// JANVI PROGRAM
import java.util.Scanner;

public class StudentInfo
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    
      int n;
      do
      {
        System.out.print("Enter array size :-");
        n=sc.nextInt();
        if(n<=0)
        
           System.out.printf("\n oopss!!!!!! Array size invalid please try again \n ");
        
      }while(n<=0);
      
    String name[] = new String[n];
    
    for(int i=0;i<name.length;i++)
    {
      System.out.printf("\n Student Name : ");
      name[i] = sc.next();
    }
     System.out.println(" all the student :");
     
     int cnt = 0;
     
    for(String sname:name)
    {
       System.out.printf("%s\t",sname);
       
       if(sname.charAt(0) == 'h')
         cnt++ ;
    }
    if(cnt>0)
    {
      for(String sname:name)
      {
         if(sname.charAt(0) == 'h')
            System.out.printf("\n==================\n");
            System.out.printf("%s\n ",sname);
      }
    }
   
  }
}