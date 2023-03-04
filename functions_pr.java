// 
import java.util.*;

public class functions_pr{
public static int CalculateSum(int a , int b) {
    int sum = a + b;
    return sum;
    
}
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    sc.close();
    int sum = CalculateSum(a, b);
    System.out.println("Sum of two numbers: " + sum);

}

}

// import java.util.*;

// public class functions_pr{
//     public static double average(int a , int b) {
//         int avg = (a + b) / 2;
//         return avg;

//     }
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int a = sc.nextInt();
//         int b = sc.nextInt();
//         sc.close();
//         double avg = average(a, b);
//         System.out.println("Average: " + avg);
//     }
// }


// import java.util.*;
// public class functions_pr{
// public static double average(int a , int b ) {
//     int avg  = (a + b) / 2;
//     return avg;

    
// }
// public static void main(String[] args) {
//     Scanner sc = new Scanner(System.in);
//     System.out.print("Enter first variable one  : ");
//     int a = sc.nextInt();
//     System.out.print("Enter first variable second : ");
//     int b = sc.nextInt();
//     sc.close();

//     double avg = average(a, b);
//     System.out.println("Average : " + avg);
// }
// }



