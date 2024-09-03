import java.util.*;

class Result{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    String sname="",cname="";
    int seatNo = 0,code = 0,pmark = 0;
    String subs[] = {"Web-2",".Net","Java","Iot","Is"};
    int marks[] = new int[5];
    int cnt = 0;
    
    try{
      System.out.println("Enter Is Your Seat No :-");
      seatNo = sc.nextInt();
      if(seatNo<=0)
      {
        throw new InvalidSeatNoException();
      }
      System.out.println("Enter Is Your Name :-");
      sname = sc.next().toUpperCase();
      if(sname == null || sname.isEmpty())
      {
        throw new InvalidNameException();
      }
      for(int i=0;i<sname.length();i++)
      {
        char c = sname.charAt(i);
        switch(c)
        {
          case 'A':
          case 'E':
          case 'I':
          case 'O':
          case 'U':
            cnt++;
            break;
        }
      }
      if(cnt==0)
      {
        throw new InvalidNameException(); 
      }
       System.out.println("Enter Is Your College Name :-");
       cname = sc.next().toUpperCase();
       if(!(cname.equalsIgnoreCase ("TMTBCA")))
       {
         throw new InvalidClgNameException(); 
       }
      System.out.println("Enter Is Your Center Code :-");
      code = sc.nextInt();
      if(code<=0)
      {
        throw new InvalidCenCodeException();
      }
     
      System.out.println("Enter Is Your Theory Marks :-");
      for(int i=0;i<marks.length;i++)
      {
        System.out.printf("Enter Marks %s :-",subs[i]);
        marks[i] = sc.nextInt();
        if(marks[i] <0||marks[i]>100){
          throw new InvalidMarksOfThoException();
        }
      }
       System.out.println("Enter Is Your Practical Marks :-");
      pmark = sc.nextInt();
      if(pmark<0|| pmark >200)
      {
        throw new InvalidMarksOfPraException();
      }
    }
    catch(InvalidSeatNoException e)
    {
      System.out.println(e);
    }
     catch(InvalidNameException e)
    {
      System.out.println(e);
    }
      catch( InvalidClgNameException e)
    {
      System.out.println(e);
    }
       catch(InvalidCenCodeException e)
    {
      System.out.println(e);
    }
        catch(InvalidMarksOfThoException e)
    {
      System.out.println(e);
    }
        catch( InvalidMarksOfPraException e)
    {
      System.out.println(e);
    }
        
   System.out.print("\n|======Result========|\n");
   System.out.printf("\n 1.Seatno :-%d",seatNo);
   System.out.print("\n|====================|\n");
   System.out.printf("\n 2.Student name :-%s",sname);
   System.out.print("\n|====================|\n");
   System.out.printf("\n 3.College Name :-%s",cname);
   System.out.print("\n|====================|\n");
   System.out.printf("\n 4.Center Code :-%d",code);
   System.out.print("\n|====================|\n");
   System.out.printf("\n 5.Theory Marks");
   for(int i=0;i<marks.length;i++){
     System.out.printf("\n Subject name :-%s marks :-%d",subs[i],marks[i]);
     System.out.print("\n|===================|\n");
   }  
   System.out.print("\n|===================|\n");
   System.out.printf("\n 6.Practical marks :-%d",pmark);
   System.out.print("\n|====================|\n");
  }
}