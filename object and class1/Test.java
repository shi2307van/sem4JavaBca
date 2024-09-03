import java.util.*;
class Test extends Stud{
  Scanner sc = new Scanner(System.in);
  float part1,part2;
  
  void getMarks(){
    System.out.println("Enter Marks1 :-");
    part1 = sc.nextFloat();
     System.out.println("Enter Marks2 :-");
    part2 = sc.nextFloat();
  }
  void putMarks(){
     System.out.println("\n Marks Obtained");
     System.out.println("\t part1 :-"+ part1);
     System.out.println("\t part2 :-"+ part2);
  }
}