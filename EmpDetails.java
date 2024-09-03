import java.util.*;

class EmpDetails
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
   
    int n;
    int i;
    do
      {
        System.out.print("Enter Employee number :-");
        n=sc.nextInt();
        if(n<=0)
       
           System.out.printf("\n oopss!!!!!! Array size invalid please try again \n ");
       
      }while(n<=0);
     
      int ecode[] = new int[n];
      String ename[] = new String[n];
      int salary[] = new int[n];
      String designation[] = new String[n];
      String email[] = new String[n];
      int exp[] = new int[n];
      for( i=0;i<n;i++)
      {
        System.out.printf("Enter Details Of Employee %d \n",i+1);
           System.out.printf("Employee Code = ");
            ecode[i] = sc.nextInt();
           System.out.printf("Employee Name = ");
            ename[i] = sc.next();
           System.out.printf("Employee Salary = ");
            salary[i] = sc.nextInt();
           System.out.printf("Employee Designation = ");
             designation[i] = sc.next();
           System.out.printf("Employee Email = ");
            email[i] = sc.next();
           System.out.printf("Employee Experience = ");
            exp[i] = sc.nextInt();
     }
       int ch ;
       do{
         System.out.println("\n ==============   MENU  ============\n ");
         System.out.println("1.Display all employees.");
         System.out.println("2.Display all \"Develpoers\".");
         System.out.println("3.Display Experience-wise employees.");
         System.out.println("4.Display all having accountin \"gmail\".");
         System.out.println("5.Display employees earning more than 25,000.");
         System.out.println("6.Exit");
         System.out.println("Enter your choice : ");
         ch = sc.nextInt();
         switch(ch)
         {
           case 1:
              System.out.printf("\n %6s | %10s | %7s | %10s | %10s \n","Emp NO","Emp Name","Emp salary","Emp Designation","Emp Email","Emp Experience");
   
              for(i=0;i<n;i++)
              {
                System.out.printf("\n %6d | %10s | %7d | %10s  |%10s \n ", ecode[i],  ename[i] , salary[i], designation[i], email[i],exp[i]);
                System.out.println("\n=====================================================================\n");
              }
             break;
           case 2:
             System.out.printf("\n %20s","employee name has designation  like developer");
              for(i=0;i<n;i++)
              {
                if(designation[i].equals("Developer"))
                   System.out.printf("\n name of developer %20s \n",ename[i]);
              }
             break;
           case 3:
             String name ;
              int temp ;
              System.out.printf("\n %10s","experience-wise employee name \n");
              for(i=0;i<exp.length;i++){
                for(int j=i+1;j<exp.length;j++){
                  if(exp[i] < exp[j]){
                    temp = exp[i];
                    exp[i] = exp[j];
                    exp[j]= temp;
                    
                     name = ename[i];
                     ename[i] = ename[j];
                     ename[j] = name;
                  }
                }
                 System.out.printf("\n %d = %s",exp[i],ename[i]);
              }
             break;
           case 4:
             System.out.printf("\n %10s","Employee Having Account In Gmail");
              for(i=0;i<n;i++)
              {
                if(email[i].endsWith("gmail"))
                   System.out.printf("\n Employee name %20s \n" , ename[i]);
              }
             break;
           case 5:
             System.out.printf("\n %10s"," earning more than 250000 employee name");
              for(i=0;i<n;i++)
              {
                if(salary[i] > 25000)
                   System.out.printf("\n Employee name %10s\n",ename[i]);
              }
             break;
           case 6:
             System.exit(0);
             break;
         }
       }while(ch!=6);
   
  }
}

