abstract class Cricketers{
  String name;
  int matches;
  Cricketers(String name,int matches){
    this.name = name; 
    this.matches = matches;
  }
  abstract double Average();
  abstract public  String toString();
}