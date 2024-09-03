  class Product implements Runnable{
  Thread t;
  String name[];
  int price[];
  int qty[];
  Product(String name[],int price[],int qty[]){
    this.name = name;
    this.price = price;
    this.qty = qty;
    t = new Thread(this);
    t.start();
  }
  void sortQty(){
    int i,tmpage,tmtprice,j;
    String tmpname;
    for(i=0;i<name.length;i++){
      for(j=i+1;j<name.length;j++){
        if(qty[i]>qty[j]){
          tmtprice = price[i];
          price[i] = price[j];
          price[j] = tmtprice;
          
          tmpage = qty[i];
          qty[i] = qty[j];
          qty[j] = tmpage;
          
          tmpname = name[i];
          name[i] = name[j];
          name[j] = tmpname;
        }
      }
    }
  }
  public void run(){
    sortQty();
    try{
     
      for(int i=0;i<name.length;i++){
        System.out.printf(" \n %5s  %5s  %5s","Product Name","Product Price","Product Qty \n");
        System.out.printf("%10s  %10d  %10d ",name[i], price[i] ,qty[i]);
        Thread.sleep(2000);
      }
    } 
    catch(Exception e){
      System.out.println("Main Thread Inturrupted" + e);
    }
  }
} 