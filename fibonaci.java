// import java.util.*;
// public class fibonaci {
//     public static int main(int range) {
//         int a =0 ;
//         int b =1 ;
//         int result= 0;
//         // int temp = 0 ;
//         if (range > 1) {
//             for (int i = 2; i <=range ; i++) {
//                 int temp = b ;
//                 b = b +a ;
//                 a = temp;
//                 result = a ;
//             }
            
            
//         }
//         return result;
//     }
    
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//         System.out.println("Enter range: ");
//         int range =scanner.nextInt();
//         scanner.close();

//         int fibo = main(range);
//         System.out.println("Fibo: "+ fibo);
//     }
// }

import java.util.*;
public class fibonaci {
    public static int fibo(int length) {
        int a =0;
        int temp = 0;
        int b =1 ;
        int display=0;
        if(length>1) {
            for(int i=2;i<=length;i++){
           temp = b;
            b = b+a;
            a =temp;
            display = a;
            }
        
    }
    return display;
}
public static int recursive (int n) {
    if(n <=1 ){
        return n;
    }else {
    return recursive(n-1)+recursive(n-2);
}
}

public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter length: ");
    int length = sc.nextInt();
    System.out.print("Enter value for n: ");
    int n = sc.nextInt();

    sc.close();
    int answer =fibo(length);
    System.out.println("Series : "+ answer);

    int recu = recursive(n);
    System.out.println("recursion : "+recu);
}
}