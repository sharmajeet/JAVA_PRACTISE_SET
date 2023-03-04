// import java.util.*;
// public class Pattern {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//         System.out.print("Enter value of Row : ");
//         int row_max = scanner.nextInt();
//         System.out.print("Enter value of Column : ");
//         int col_max = scanner.nextInt();
//         scanner.close();

//       for (int i = 1; i <=row_max; i++) {
//         for (int j = 1; j <=col_max-i; j++) {
//             System.out.print(" ");
//         }
//         for (int j = 1; j <=i;j++) {
//             System.out.print("*");
//     }
//     System.out.println();
// }
//     }
// }
import java.util.*;
public class Pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Row value : ");
        int m = sc.nextInt();
        System.out.print("col value : ");
        int n = sc.nextInt();
        sc.close();

        for (int i = m; i>=1; i--) {
            for (int j = 1; j <=i; j++) {
                System.out.print( j);
                
            }
            System.out.println();
        }
    }
}