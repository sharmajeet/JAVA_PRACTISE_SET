import java.util.*;
public class mul_table {
public static void main(String[] args) {
    // int i = 1;
    // int j = 1;    
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter Table startinge value : ");
    int n = sc.nextInt();
    sc.close();

    for (int i = 1; i <=10; i++) {
        System.out.println(n + " * " + i + " = "+ n * i);
        
    }
}  
}
