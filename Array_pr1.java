// // import java.util.*;
// // public class Array_pr1{
// //     public static void main(String[] args) {
// //         Scanner sc = new Scanner(System.in);
// //         System.out.print("Enter Size: ");
// //         int size = sc.nextInt();
// //         int arr[] = new int[size];
        

// //         // input loop
// //         System.out.println("--------Input-----------");
// //         for( int i=0 ; i<size; i++ ) {
// //             arr[i] = sc.nextInt();
                  
// //         }
    
// //     // output loop
// //     System.out.println("=====Output=========");
// //     for(int i= 0; i<size; i++) {

// //         System.out.print("\t"+ arr[i]);
// // }
        

// // }
// // }


// // Liner search for array elements

// import java.util.*;
// public class Array_pr1{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter size : ");
//         int size = sc.nextInt();
//         int marks[] = new int[size];
//         System.out.println("Enter Array Values : ");
//         for(int i=0; i<size; i++) {
//             marks[i] =sc.nextInt();
//                 }
//                 System.out.print("Enter finding value : ");
//             int find_value = sc.nextInt();
            
//             for(int i=0; i<size; i++) {
//                 if(marks[i] == find_value)
//                 System.out.print(find_value+ " Found at "+ i + " Location.");

//             }
// }
// }

import java.util.*;
public class Array_pr1{
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        System.out.print("Enter Size : ");
        int size = sc.nextInt();
        int array[] =new int[size];

        for (int i = 0; i < size; i++) {
            array[i] = sc.nextInt();
            
        }
        System.out.print("Enter Value You Want to Search : ");
        int find_value = sc.nextInt();
        for (int i = 0; i < array.length; i++) {
            if ( find_value == array[i] ){
            System.out.print(find_value + " Find At " + i + " Locaton");
            }
           
        }
        
      
    }
}