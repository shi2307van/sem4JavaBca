/*import java.util.*;

class BinToDec
{
 static boolean isBinStr(String str)
  {
    char bit;
    for(int i=0;i<bit.length;i++)
    {
      bit = str.charAt(i);
      if(bit !='0' || bit!='1')
      {
        return false;
      }
      return true;
    }
  }
  static int binTodec(String str)
  {
    int bit;
    int pow = 1;
    int sum = 0;
    
    if( isBinStr(str)==0)
      true;
    else 
    for(str.length-1;i>=0;i--)
    {
      bit = (int)(str.charAt(i));
      sum = sum + bit * pow;
      pow *= 2;
    }
    System.out.print("sum ",sum);
  }
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    String str;
    System.out.print("Enter the binary code of any number");
    str = sc.nextLine();
    binTodec(str);
  }
}*/
import java.util.*;
class  BinToDec{
    
  public static void main(String[] args) {
      
    Scanner sc = new Scanner(System.in);
    long num;
    System.out.print("Enter the binary code of any number");
    num = sc.nextLong();
    // binary number
  

    // call method by passing the binary number
    int decimal = convertBinaryToDecimal(num);

    System.out.println("Binary to Decimal");
    System.out.println(num + " = " + decimal);
  }

  public static int convertBinaryToDecimal(long num) {
    int decimalNumber = 0, i = 0;
    long remainder;
    
    while (num != 0) {
      remainder = num % 10;
      num /= 10;
      decimalNumber += remainder * Math.pow(2, i);
      ++i;
    }
    
    return decimalNumber;
  }
}