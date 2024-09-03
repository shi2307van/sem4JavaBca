class Results extends Test implements Sports{
  float total;
  
  public void putWt(){
    System.out.println("\t Sport's Weight :-" + sportWt);
  }
  void display(){
    total = part1 + part2 +sportWt;
    putNumber();
    putMarks();
    putWt();
    System.out.println("\n Total Score :-" + total);
  }
}