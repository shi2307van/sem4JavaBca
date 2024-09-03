class Bowler extends Cricketers{
  int wickets;
  Bowler(String name,int matches,int wickets){
    super(name,matches);
    this.wickets = wickets;
  }
  double Average(){
    return wickets/matches;
  }
  public String toString(){
    return String.format("Bowler's details .....%n Name : %s%n Total Matches :%d %n Total Runs :%d %n Average Runs :%.2f %n ",name,matches,wickets,Average());
  }
}