class Penguin extends Bird implements CanSwim{
  Penguin(String name){
    super(name);
  }
  public void swim(){
    System.out.println("I Can Swim But Colud Not Fly \n");
  }
}