class InvalidMarksOfPraException extends Exception{
  public String toString(){
    return "Please Enter Valid Practical Marks. Practical Marks Can Not Negative , Zero or More than 200,Please Try Again";
  }
}