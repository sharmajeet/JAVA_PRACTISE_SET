// import java.util.*;
// public class Collage_practicles {
    
   
// practice no :3
// P3: Write a program to perform arithmetic and bitwise operations by creating individual methods and classes than create an object to execute the individual methods of each operation.

public class Collage_practicles{
    public static void main(String[] args) {
        Arithmetic arithmetic = new Arithmetic();
        int sum = arithmetic.add(10,5);
        System.out.println("10 + 5 = " + sum);
    }
}

class Arithmetic{
    public int add(int a, int b){
        return a + b;
    }
}
// 

// 
