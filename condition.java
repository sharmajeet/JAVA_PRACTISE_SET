import java.util.*;

public class condition {
    public static void main(String[] args) 
    {
    //     System.out.println("============================================"); 
    //     Scanner sc = new Scanner(System.in);
    //     System.out.println("Enter value for num1");

    //    int num1 = sc.nextInt();
    //    System.out.println("Enter value for num2");

    //     int num2 = sc.nextInt();
    //     sc.close();
    //     if(num1 == num2) {
    //         System.out.println("SAME");
    // }
    // else if(num1>num2) {
    //     System.out.println("Num1 is Greter then num2");
    // }
    // else{
    //     System.out.println("Num1 is less then num2");
    // }
        Scanner sc = new Scanner(System.in);
        System.out.println("Choose case value for button");
        int button= sc.nextInt();
sc.close();
       
    switch (button)  {
        case 1:
        System.out.println("right");
                break;

        case 2 :
        System.out.println("left");
        break;

        case 3:
        System.out.println("center");
        break;

        default:
        System.out.println("Inavalide");



    }
    }
}
