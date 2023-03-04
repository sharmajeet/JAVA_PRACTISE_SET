import java.util.*;
public class Array_string {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);   
        System.out.println("Enter size: ");
        int size = scanner.nextInt();
        String Array[]= new String[size];

        System.out.println("=Input=");
        for (int i=0; i<size; i++){
            Array[i] = scanner.next();

        }
            System.out.println("=output=");
        for (int i = 0; i < Array.length; i++) {
            System.out.print("\t" + Array[i]);
        }
    }
    
}
