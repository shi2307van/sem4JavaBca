class Bats extends Cricketers{
  int runs;
  Bats(String name,int matches,int runs){
    super(name,matches);
    this.runs = runs;
  }
  double Average(){
    return runs/matches;
  }
  public String toString(){
    return String.format("Batsman's details .....%n Name : %s%n Total Matches :%d %n Total Runs :%d %n Average Runs :%.2f %n ",name,matches,runs,Average());
  }
}