package Day20;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Activity3 {
    public static void main(String[] args) {
        //Task 11: Write a method to rotate an array left and right by k positions.
        //Task 12: Implement a method that returns duplicate elements in an array.
       //Task 13: Use HashSet to remove duplicates from an array.
      //Task 14: Demonstrate use of Arrays.sort() with a custom comparator.
      //Task 15: Create a matrix (2D array) and print its transpose.
      int[] leftArr = {1,2,4,6,7,9};
      int[] rightArr = {2,4,6,8,10};
      int k=2;
      leftRotate(leftArr, k);
      rightRotate(rightArr, k);

      System.out.println("Left Rotated");
      for(int nums:leftArr)
        System.out.print(nums + " ");
        System.out.println();

      System.out.println("Right Rotated");
      for(int num : rightArr) 
      System.out.print(num + " ");
      System.out.println();
    
      int[] arr={4,2,1,4,2,3,4,7,8,9};
      List<Integer> duplicates = findDuplicates(arr);
      System.out.println("Duplicate Elements: " + duplicates);

      int[] array = {2,1,3,4,1,4,2,6,7,8,8,9};
      int[] noDuplicates = removeDuplicates(array);
      System.out.println("Array after removing duplicates: " + Arrays.toString(noDuplicates));

      Integer[] arrs = {5,9,2,3,1};
      Arrays.sort(arrs,(a,b)->b-a);
      System.out.println("Sorted in descending order: " + Arrays.toString(arrs));

      int[][] matrix = {{1,2,3},{4,5,6}};
      System.out.println("Original Matrix:");
      printMatrix(matrix);

      int[][] transpose  = getTranspose(matrix);
      System.out.println("Transpose matrix");
      printMatrix(transpose);



    }   
    public static void reverse(int[] arr,int start,int end){
        while(start<end){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
    }

    public static void leftRotate(int[] arr,int k){
        int n=arr.length;
        k=k%n;
        reverse(arr,0,k-1);
        reverse(arr, k, n-1);
        reverse(arr, 0, n-1);
    }
    public static void rightRotate(int[] arr,int k){
        int n=arr.length;
        k=k%n;
        reverse(arr, 0, n-1);
        reverse(arr, 0, k-1);
        reverse(arr, k, n-1);
    }
    public static List<Integer> findDuplicates (int[] arr){
        Map<Integer,Integer> freqMap = new HashMap<>();
        List<Integer> duplicates = new ArrayList<>();
        for(int num:arr){
            freqMap.put(num, freqMap.getOrDefault(num, 0)+1);
        }
        for(Map.Entry<Integer,Integer> entry : freqMap.entrySet()){
            if(entry.getValue()>1){
                duplicates.add(entry.getKey());
            }
        }
        return duplicates;
    }
    public static int[] removeDuplicates(int[] arr){
        Set<Integer> set = new HashSet<>();
        for(int num:arr){
            set.add(num);
        }
        int[] result = new int[set.size()];
        int index = 0;
        for(int num:set){
            result[index++]=num;
        } 
        return result;
    }
    public static int[][] getTranspose(int[][] matrix){
        int rows = matrix.length;
        int cols = matrix[0].length;

        int[][] transpose = new int[cols][rows];
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                transpose[j][i]=matrix[i][j];
            }
        }
        return transpose;
    }
    public static void printMatrix(int[][] mat){
        for(int[] row: mat){
            for(int val:row){
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }
}
