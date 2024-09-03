class BankDemo{
  public static void main(String args[]){
    CheckingAccount c = new CheckingAccount(101);
    System.out.println("Depositing RS.500....");
    c.deposit(500.00);
    double bal;
    try{
     System.out.println("WithDrawing RS.100....");
     c.withdraw(100.00);
     bal = c.getBalance();
     System.out.println(bal);
     
     System.out.println("WithDrawing RS.600....");
     c.withdraw(600.00);
     bal = c.getBalance();
     System.out.println(bal);
    }
    catch(InsufficientFundsException e){
      System.out.println("Sorry ,But You Are Shorts Rs."+e);
    }
  }
}