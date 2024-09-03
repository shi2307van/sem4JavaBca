class Dove extends Bird implements CanFly{
  Dove(String name){
    super(name);
  }
  public void fly(){
    System.out.println(" I Can fly in The Sky.....\n");
  }
}