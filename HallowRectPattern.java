// import java.util.*;
// public class HallowRectPattern {
// public static void main(String[] args) {
//     Scanner scanner = new Scanner(System.in);
//         System.out.print("Enter Row value: ");
//     int row_max = scanner.nextInt();
//     System.out.print("Enter Column value: ");
//     int col_max = scanner.nextInt();
//     scanner.close();
//     // int row_max = 4;
//     // int col_max = 5;

//     for (int i = 1; i <= row_max; i++) {

//         for (int j = 1; j <= col_max ; j++) {

//             if (i==1 || j==1 ||  j == col_max || i == row_max ) {
//                 System.out.print("*");
//             }
//             else {
//                     System.out.print(" ");
//                 }
//             }
//             System.out.println();
        
//         }
       
    
// }    
// }


// 4th program

import java.util.*;
public class HallowRectPattern {
public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Row value: ");
    int row_max = scanner.nextInt();
    System.out.print("Enter Column value: ");
    int col_max = scanner.nextInt();
    scanner.close();
    // int row_max = 4;
    // int col_max = 5;

    for (int i = 1; i <= row_max; i++) {

        for (int j = 1; j <=i; j++) {

            if (i==1 || j==1 ||  j == col_max || i == row_max ) {
                System.out.print("*");
            }
            else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        
        }
       
    
}    
}





// 2nd program

// import java.util.*;
// public class HallowRectPattern {
// public static void main(String[] args) {
//     Scanner scanner = new Scanner(System.in);
//         System.out.print("Enter Row value: ");
//     int row_max = scanner.nextInt();
//     // System.out.print("Enter Column value: ");
//     // int col_max = scanner.nextInt();
//     scanner.close();
//     // int row_max = 4;
//     // int col_max = 5;

//     for (int i = 1; i <= row_max; i++) {  //as value increases of i and it update * number .

//         for (int j = 1; j <=i ; j++) {

//                     System.out.print("*");
//                 }
//                 System.out.println();
//             }
            
        
//         }
       
    
// }    



//3rd program

// import java.util.*;
// public class HallowRectPattern {
// public static void main(String[] args) {
//     Scanner scanner = new Scanner(System.in);
//         System.out.print("Enter Row value: ");
//     int row_max = scanner.nextInt();
//     // System.out.print("Enter Column value: ");
//     // int col_max = scanner.nextInt();
//     scanner.close();
//     // int row_max = 4;
//     // int col_max = 5;

//     for (int i = row_max; i>=1 ; i--) {  //as value increases of i and it update * number .

//         for (int j = 1; j <=i ; j++) {

//                     System.out.print("*");
//                 }
//                 System.out.println();
//             }
            
        
//         }
       
    
// }    

