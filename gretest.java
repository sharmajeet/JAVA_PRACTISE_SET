import java .util.*;

public class gretest {
public static String gretest_flag(int a , int b) {
        String result ;           
      if (a>= b) {
         result =  a + " is greater then " + b;
        
      }else{
        result = b + "  is greater then "+ a ;
      }
      return result ;

}    
public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter value a =: ");
    int a = scanner.nextInt();
    System.out.print("Enter value b =: ");
    int b= scanner.nextInt();
    scanner.close();

    String result = gretest_flag(a, b);
    System.out.println("Gretest result: " + result);

}
}
