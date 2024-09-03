class Invoice implements Payable{
   int proid;
   String name;
   int qty;
   float price;
  
  Invoice(int proid,String name,int qty,float price){
    this.proid = proid;
    this.name = name;
    this.qty = qty;
    this.price = price;
  }
  int getProid(){
    return proid;
  }
  String getName(){
    return name;
  }
  int getQty(){
    return qty;
  }
  float getPrice(){
    return price;
  }
  void setProid(int proid){
      this.proid = proid;
  }
  void setName(String name){
      this.name = name;
  }
    void setQty(int qty){
      this.qty = qty;
    }
    void setPrice(float price){
      this.price = price;
    }
    public  double getPaymentAmount(){
      return qty * price;
    }
    public String toString(){
      return String.format("\n %4d %20s %20d %20f %25s",proid,name,qty,price,getPaymentAmount());
    }
}