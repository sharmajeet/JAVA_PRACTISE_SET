// import java.util.*;
// public class flyoids_triangle {
//     public static void main(String[] args) {
      
//     Scanner scanner = new Scanner(System.in);
//     int number = 1;
//     System.out.print("Enter length of triangle : ");
//     int length = scanner.nextInt();
//     scanner.close();

//     for (int i = 1; i <=length; i++) {
//         for (int j = 1; j <=i; j++) {
//             System.out.print(number + " ");
//             number ++;
            
//         }
//         System.out.println();

//     }
    
// }
// }

import java.util.*;
public class flyoids_triangle {
    public static void main(String[] args) {
      
    Scanner scanner = new Scanner(System.in);
    // int number = 1;
   
    System.out.print("Enter length of triangle : ");
    int length = scanner.nextInt();
    scanner.close();

        for (int i = 1; i <=length; i++) {
            for (int j = 1; j <=i; j++) {
                int sum = i+j;
                if (sum % 2 == 0) {
                    System.out.print(" 1");
                    
                }
                else {
                    System.out.print(" 0");
            }
            
        }
    System.out.println();
            
        }
    }
}

        // System.out.println();

    

