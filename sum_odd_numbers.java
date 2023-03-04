
// import java.util.*;
// public class sum_odd_numbers{
// public static int odd_sum(int n ) {
//     int sum = 0;
//     for( int i = 0; i <= n; i++ )
//     {
//         if(i % 2 != 0){
//             sum = sum + i;
//         }
       
//     }
//     return sum;
// }
// public static void main(String[] args) {
//     Scanner sc = new Scanner(System.in);
//     System.out.print("Enter value for N : ");
//     int n = sc.nextInt();
//     sc.close();
//     int sum = odd_sum(n);
//     System.out.println("Sum of odd numbers : "+ sum);

// }
// }

import java.util.*;
public class sum_odd_numbers{
public static int odd_sum(int n ) {
    int sum = 0;
    for (int i = 0; i <= n; i++) {
        if (i % 2 != 0) {
            sum = sum + i;
        
    }
}
return sum;
}
public static int even_sum(int n ) {
    int sum = 0;
    for (int i = 0; i <= n; i++) {
        if (i % 2 == 0) {
            sum = sum + i;
        
    }
}
return sum;
}


public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    sc.close();

    int sum = odd_sum(n);
    int sum2 =even_sum(n);
    System.out.println(sum);
    System.out.println(sum2);
}
}