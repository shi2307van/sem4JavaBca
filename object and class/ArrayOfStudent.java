import java.util.*;

class ArrayOfStudent{
  public static void main(String[] args){
    Scanner sc = new Scanner (System.in);
    
    int n,sem ,rollno,ch;
    char div;
    String name,email;
    
    System.out.println("Enter no .of Student :-");
    n = sc.nextInt();
    
    Student s[] = new Student[n];
    for(int i=0;i<n;i++){
      System.out.printf("Enter Properties Of Student %d:=",i+1);
       System.out.println("\n Rollno :-");
       rollno = sc.nextInt();
       System.out.println("\n Name :-");
       name = sc.next();
       System.out.println("\n Semester :-");
       sem =  sc.nextInt();
       System.out.println("\n Division :-");
       div = sc.next().trim().toUpperCase().charAt(0);
       System.out.println("\n Email :-");
       email = sc.next().toLowerCase();
       s[i] = new Student (rollno,name,sem,div,email);
    }
    do{
      System.out.println("\n =========Menu=========\n");
      System.out.println("1. Display All Student.");
      System.out.println("2. Display Only 4 Sem Student");
      System.out.println("3. Display only 4 Sem and Div B Student");
      System.out.println("4. Display Student Having Substring \"ya\" ");
      System.out.println("5. Display Student In Ascending Order Of Rollno");
      System.out.println("6. Display Student In Descending Order Of Thier Name");
      System.out.println("7. Exit");  
      System.out.println("Enter Your Choice :=");
      ch = sc.nextInt();
      
      switch(ch){
        case 1:
          System.out.println("\n ============1. Display All Student.=============\n");
          System.out.printf("\n%-20s %-20s %-20s %-20s %-30s","Rollno","Full Name","Semester","Division","Email-ID");
          for(int i=0;i<n;i++){
            System.out.println(s[i]);
          }
        break;
        
        case 2:
          System.out.println("\n ============2. Display Only 4 Sem Student.=============\n");
          System.out.printf("\n %-20s %-20s %-20s %-20s %-30s","Rollno","Full Name","Semester","Division","Email-ID");
          for(int i=0;i<n;i++){
            if(s[i].getSem() == 4){
              System.out.println(s[i]);
            }
          }
        break;
        case 3:
           System.out.println("\n ============2. Display Only 4 and division B Sem Student.=============\n");
          System.out.printf("\n %-20s %-20s %-20s %-20s %-30s","Rollno","Full Name","Semester","Division","Email-ID");
          for(int i=0;i<n;i++){
            if(s[i].getSem()==4 & s[i].getDiv()=='B'){
              System.out.println(s[i]);
            }
          }
        break;
        case 4:
           System.out.println("\n ============2. Display Only 4 Sem Student.=============\n");
          System.out.printf("\n %-20s %-20s %-20s %-20s %-30s","Rollno","Full Name","Semester","Division","Email-ID");
          for(int i=0;i<n;i++){
            if(s[i].getName().indexOf("ya") >=0){
              System.out.println(s[i]);
            }
          }
        break;
        case 5:
          System.out.println("\n ============2. Display Only 4 Sem Student.=============\n");
          System.out.printf("\n %-20s %-20s %-20s %-20s %-30s","Rollno","Full Name","Semester","Division","Email-ID");
          Student temp;
          for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
              if(s[i].getRollno() < s[j].getRollno()){
                temp = s[i];
                s[i] = s[j];
                s[j] = temp;
              }
            } 
          }
          for(int i=0;i<n;i++){
             System.out.println(s[i]);
          }
        break;
        case 6:
           System.out.println("\n ============2. Display Only 4 Sem Student.=============\n");
          System.out.printf("\n %-20s %-20s %-20s %-20s %-30s","Rollno","Full Name","Semester","Division","Email-ID");
          for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
            if(s[i].getName().compareTo(s[j].getName())<0){
             System.out.println(s[i]);
              System.out.println(s[j]);
            }
           }
          }
        break;
        case 7:
          System.exit(0);
        break;
        default :
          System.out.println("Invalid Choice ....Please Try Again!!!!");
          break;
      }
    }while(ch!=7);
  }
}