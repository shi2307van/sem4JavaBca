class InsufficientFundsException extends Exception{
  double needs;
  InsufficientFundsException(double needs){
    this.needs = needs;
  }
  public String toString(){
    return "Your Balance Not Sufficient For WithDrow"+needs+".";
  }
}