class InvalidNameException extends Exception{
  public String toString(){
    return "Please Enter Valid Name. Name Can Not Empty Or It Must Contain At least One Vowel,Please Try Again";
  }
}