class AccountDemo
{
  public static void main(String[] args)
  {
    Account a1 =new Account(12345,"shivani shinde",10000);
    a1.display();
    a1.checkBalance();
    a1.deposit(40000);
    a1.checkBalance();
    a1.withdraw(15000);
    a1.checkBalance();
  }
}