import java.util.*;
public class 2DArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Eneter value for Row : ");
        int row = scanner.nextInt();
        System.out.print("Enter value for Column : ");
        int col = scanner.nextInt();
        System.out.print("Enter array value :");
        int array[][]= new int[row][col];

        for(int i = 0; i <row ; i++) {
            for(int j = 0; j <col; j++){
                array[i][j] = scanner.nextInt();

            }

    }
    for(int i = 0; i <row ; i++) {
        for(int j = 0; j <col; j++) {
            System.out.print(array[i][j] + " ");
        }
    }
}
}