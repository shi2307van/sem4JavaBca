class Account
{
  long acc_no;
  String name;
  float amount;
  Account(long a,String n,float amt)
  {
    acc_no = a;
    name = n;
    amount = amt;
  }
  void deposit(float amt){
    amount = amount +amt;
    System.out.println(amt + " "+ "Deposited");
  }
  
  void withdraw(float amt)
  {
    if(amount<amt)
      System.out.println(amt +" "+ "Insufficient Balance");
    else
      amount = amount-amt;
      System.out.print(amt +" "+ "Withdrawn");
  }
  void checkBalance()
  {
    System.out.println("Balance Of :-" +" "+ amount);
  }
  void display()
  {
    System.out.println(acc_no+ " " +name+" "+amount);
  }
  
}