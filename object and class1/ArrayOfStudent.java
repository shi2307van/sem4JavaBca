import java.util.*;

class ArrayOfStudent{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n,sem,rno,ch;
    char div;
    String name,email;
    System.out.println("Enter Number Of Student :-");
    n = sc.nextInt();
    
    Student s[] = new Student[n];
    for(int i=0;i<n;i++){
       System.out.printf("\n Enter Properties Of Student %d :-\n",i+1);
        System.out.println("\n Enter Roll No Student :-");
        rno = sc.nextInt();
        System.out.println("\n Enter Name Of Student :-");
        name = sc.next().toUpperCase();
        System.out.println("\n Enter Semester Of Student :-");
        sem = sc.nextInt();
        System.out.println("\n Enter Division Of Student :-");
        div = sc.next().trim().toUpperCase().charAt(0);
        System.out.println("\n Enter Email Of Student :-");
        email = sc.next().toLowerCase();
        
        s[i] = new Student(rno,name,sem,div,email);
    }
    
    do{
      
       System.out.println("\n ===============MENU===============\n");
       System.out.println("1. Display All Student..");
       System.out.println("2. Display Only 4 Sem Student..");
       System.out.println("3. Display Only 4 Sem Division B Student..");
       System.out.println("4. Display Student Having SubString \"ya\"..");
       System.out.println("5. Display Student in Ascending Order Of Rollno..");
       System.out.println("6. Display Student in Descending Order Of Their Name..");
       System.out.println("7.Exit..");
       
          System.out.println("Enter Your Choice :- ");
          ch = sc.nextInt();
          
          switch(ch){
            case 1:
              System.out.println("======= Display All Student.==========");
              System.out.printf("\n %4s %20s %20s %20s %20s","Rollno","Full Name","Semester","Division","Email-Id");
              for(int i=0;i<n;i++){
                System.out.print(s[i]);
              }
              System.out.println("\n");
              break;
            case 2:
               System.out.println("=========Display Only 4 Sem Student.=======");
                System.out.printf("\n %4s %20s %20s %20s %20s","Rollno","Full Name","Semester","Division","Email-Id");
              for(int i=0;i<n;i++){
                if(s[i].getSem()==4){
                System.out.print(s[i]);
               }
              }
              System.out.println("\n");
              break;
            case 3:
                System.out.println("=========Display Only 4 Sem and Division B Student.=======");
                System.out.printf("\n %4s %20s %20s %20s %20s","Rollno","Full Name","Semester","Division","Email-Id");
              for(int i=0;i<n;i++){
                if(s[i].getSem()==4 && s[i].getDiv()=='B'){
                System.out.print(s[i]);
               }
              }
              System.out.println("\n");
              break;
            case 4:
               System.out.println("=========Display Student Having SubString \"ya\"==========");
                 System.out.printf("\n %4s %20s %20s %20s %20s","Rollno","Full Name","Semester","Division","Email-Id");
              for(int i=0;i<n;i++){
                if(s[i].getName().indexOf("YA") >=0){
                  System.out.print(s[i]);
               }
              }
              System.out.println("\n");
              break;
            case 5:
              Student temp;
                System.out.println("========= Display Student in Ascending Order Of Rollno.========");
                 System.out.printf("\n %4s %20s %20s %20s %20s","Rollno","Full Name","Semester","Division","Email-Id");
              for(int i=0;i<n;i++){
                for(int j=i+1;j<i;j++){
                  if(s[i].getRollno() > s[j].getRollno()){
                    temp = s[i];
                    s[i] = s[j];
                    s[j] = temp;
                  }
                }
                
              
              }
              System.out.println("\n");
              break;
            case 6:
            
               System.out.println("========== Display Student in Descending Order Of Their Name.==========");
                System.out.printf("\n %4s %20s %20s %20s %20s","Rollno","Full Name","Semester","Division","Email-Id");
              for(int i=0;i<n;i++){
                for(int j=i+1;j<i;j++){
                if(s[i].getName().compareTo(s[j].getName())< 0){
                  temp = s[i];
                  s[i] = s[j];
                  s[j] = temp;
                }
               }
              }
              System.out.println("\n");
              break;
            case 7:
              System.exit(0);
              break;
            default:
               System.out.println("Invalid Choice Please Try Once Again..");
              break;
          }
    }while(ch!=7);
  }
}