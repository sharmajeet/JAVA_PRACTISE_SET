import java.util.*;
public class QuadraticEquation {
    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
    System.out.println("Entering quadratic equation A :");
    double a = scanner.nextDouble();
    System.out.println("Entering quadratic equation B :");
    double b = scanner.nextDouble();
    System.out.println("Entering quadratic equation C :");
    double c = scanner.nextDouble();
    scanner.close();
    double discriminant = b*b-4*a*c;
    if (discriminant<0) {
        System.out.println("There are no quadratic equations for < 0");
                
    }else{
        double root1 = (-b +Math.sqrt(discriminant))/ (2*a); 
        double root2 = (-b +Math.sqrt(discriminant))/ (2*a); 
        System.out.println("The real solution for quadratic equations");
        System.out.println("X = " + root1 );
        System.out.println("X = " + root2 );
    }
}
}