import java.util.*;
public class Pattern_solidRect {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value for Row : ");
        int row = sc.nextInt();
        System.out.println("Enter value for Column : ");
        int col = sc.nextInt();
        sc.close();

        for ( int i = 1; i <= row; i++) {
            // System.out.println(" * ");
            for ( int j = 1; j<=col; j++) {
                System.out.print(" * ");
                
            }
            System.out.println();
            
        }
    }

    
}
