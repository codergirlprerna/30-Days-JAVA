//1D Arrays
package Day6;

public class Activity1 {
    public static void main(String[] args) {
       // Task 1: Declare and initialize an integer array with the values {5, 10, 15, 20, 25} and print each element using a for loop.
       int[] arr={5,10,15,20,25};
       for(int i=0;i<arr.length;i++){
        System.out.println(arr[i] + " ");
       }
       //Task 2: Calculate and print the sum of all elements in the array.
       int sum=0;
       for(int i=0;i<arr.length;i++){
        sum+=arr[i];
       }
       System.out.println("Sum of array is: " + sum);
       //Task 3: Find and print the maximum and minimum values in the array
       int max=arr[0];
       for(int i=0;i<arr.length;i++){
        if(arr[i]>max){
            max=arr[i];
        }
       }
       System.out.println("Maximum element in the array : " + max);

    int min=arr[0];
    for(int i=0;i<arr.length;i++){
        if(arr[i]<min){
            min=arr[i];
        }
    }
    System.out.println("Minimum element in the array is: " + min);
    }
}
