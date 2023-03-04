import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
         String my_str;
         
        Scanner scan = new Scanner(System.in);
        
         int i = scan.nextInt();
         double d = scan.nextDouble();
        my_str = scan.nextLine();
        String s = scan.nextLine();
        scan.close();
        
        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);
    }
}
