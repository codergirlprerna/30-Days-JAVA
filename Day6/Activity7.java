//2-D Array Diagonals

package Day6;

public class Activity7 {
    public static void main(String[] args) {
        //task14: Print the main diagonal elements of a 3x3 matrix.

         int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        System.out.print("Main Diagonal: ");
        for (int i = 0; i < 3; i++) {
            System.out.print(matrix[i][i] + " ");
        }

        System.out.println();
        //task15:Print the secondary diagonal elements of a 3x3 matrix.
         System.out.print("Secondary Diagonal: ");
        for (int i = 0; i < 3; i++) {
            System.out.print(matrix[i][2 - i] + " ");
        }

    }
}
