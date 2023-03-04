// import java.util.*;
// public class loops {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter value for loop iteration");
//         int value = sc.nextInt();
//         sc.close();
//         for (int i = 0; i < value; i++) {
//             System.out.println(i);
            
//         }
//     }
    
// }

// import java.util.*;
// public class loops{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter value for loops iteration : ");
//         int value =  sc.nextInt();
//         sc.close();

//         for (int i = 0; i < value; i++){
//             System.out.println(i);
//         }
//     }
// }


// while loop

// import java.util.*;
// public class loops{
//     public static void main(String[] args) {
//         int value = 0;
//         while (value<5) {
//             System.out.println(value);
//             value = value+1;
//         }
//     }
// }

// while with user input

import java.util.*;
public class loops{
    public static void main(String[] args) {
        int value = 1;

        Scanner sc = new Scanner(System.in);
       System.out.print("Enter iteration limit : ");
        int limit = sc.nextInt();
        sc.close();
        while (value <= limit) {
            System.out.println("Iteration value : " + value);
            value ++;
            
        } 
        System.out.println("Loop Executed.");
    }
}