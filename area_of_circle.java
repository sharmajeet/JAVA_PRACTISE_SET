import java.util.*;
public class area_of_circle {
    public static double circle(double radius) {
        return 2 * 3.14 * radius;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter radius: ");
        double radius = scanner.nextLong();
        scanner.close();
         
       Double ans = circle(radius);
        System.out.println("Area of circle: " + ans);
    }
    
}
