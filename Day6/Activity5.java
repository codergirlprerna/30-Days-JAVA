//passing array to methods
package Day6;

public class Activity5 {
    public static void PrintArr(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i] + " ");
        }
    }

    public static int findAverage(int[] arr){
        int sum=0;
        int avg;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
        }
        avg=sum/arr.length;
        return avg;
    }
    public static void main(String[] args) {
        //Task 10: Write a method printArray(int[] arr) that receives an array and prints its contents.
        int[] arr={1,2,3,4,5};
        PrintArr(arr);
    
    //Task 11: Write a method findAverage(int[] arr) that returns the average of all array elements.
    System.out.println("Average of all the elements: " + findAverage(arr));
    }

}
