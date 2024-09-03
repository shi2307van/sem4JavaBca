class Duck extends Bird implements CanFly,CanSwim{
  Duck(String name){
    super(name);
  }
  public void fly(){
    System.out.println("I Can Fly...\n");
  }
  public void swim(){
    System.out.println("I Can Swim...\n");
  }
}