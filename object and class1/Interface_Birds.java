class Interface_Birds{
  public static void main(String[] args){
    Dove dv = new Dove("Dove");
    dv.info();
    dv.fly();
    Duck dk = new Duck("Duck");
    dk.info();
    dk.swim();
    dk.fly();
    Penguin pgn = new Penguin("Penguin");
    pgn.info();
    pgn.swim();
  }
}