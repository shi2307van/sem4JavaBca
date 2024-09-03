class NestedClassTip{
  private String name = "shivani shinde";
  private static String staticName = "static name";
  
  class NestedOne{
    NestedOne(){
      System.out.println(name);
      System.out.println(staticName);
    }
  }
   static class NestedTwo{
    NestedTwo(){
      //System.out.println(name);
      System.out.println(staticName);
    }
  }
   public static void main(String[] args){
     NestedClassTip nct = new NestedClassTip();
     NestedClassTip.NestedOne nco = nct.new NestedOne();
     NestedClassTip.NestedTwo nc =new NestedClassTip.NestedTwo();
   }
}