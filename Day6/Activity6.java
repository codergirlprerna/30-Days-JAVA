//2-D Arrays Basic
package Day6;

public class Activity6 {
    public static void main(String[] args) {
        //Task 12: Declare and initialize a 2D int array of size 3x3. Fill it with numbers and print it in matrix form.
        int[][] arr={{1,2,3},{3,4,5}};
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        
// Task 13: Multiply two 2D matrices and print the resulting matrix.
        int[][] a = {
            {1, 2, 3},
            {4, 5, 6}
        };

         int[][] b = {
            {7, 8},
            {9, 10},
            {11, 12}
        };
        int[][] result = new int[a.length][b[0].length];

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b[0].length; j++) {
                for (int k = 0; k < b.length; k++) {
                    result[i][j] += a[i][k] * b[k][j];
                }
            }
        }

         System.out.println("Result of Matrix Multiplication:");
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[0].length; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println(); 
        }



    }
}
