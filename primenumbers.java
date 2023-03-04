// import java.util.*;
// public class primenumbers {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//         System.out.print("Enter an integer number");
//         int n = scanner.nextInt();

//         System.out.print("Prime numbers upto " + n + ": ");
//          if (n<=1) {
//             System.out.println("False");

            
//          }else {
//             // for (int i = 2; i <=n; i++) {
//                 if(n % 2 == 0){
//                     System.out.println("Prime number.");
//                 }else{
//                     System.out.println("Not prime.");
//                 }
                
//             // }
//          }

//     }
// }

import java.util.Scanner;

public class primenumbers {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int n = input.nextInt();
        input.close();
        System.out.println("Prime numbers up to " + n + ":");
        for (int i = 2; i <= n; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
    }

    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }

        return true;
    }
}

