import java.util.*;
class Stud{
  int rollno;
  Scanner sc = new Scanner(System.in);
  void getNumber(){
    System.out.println("\n Enter Roll NO :-");
    rollno = sc.nextInt();
  }
  void putNumber(){
    System.out.println("\t Rollno : " + rollno);
  }
}