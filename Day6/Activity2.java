//Array Manipulation

package Day6;

public class Activity2 {
    public static void main(String[] args) {
       // Task 4: Manually sort an array {3, 1, 4, 2, 5} in ascending order using a nested for loop (no built-in sort method).
       int arr[]={3,1,4,2,5};
       for(int i=0;i<arr.length;i++){
        for(int j=0;j<arr.length-1;j++){
            if(arr[j]>arr[j+1]){
                int temp=arr[j];
                arr[j]=arr[j+1];
                arr[j+1]=temp;
            }
        }
       }
       for(int i=0;i<arr.length;i++){
        System.out.println(arr[i]);
       }
    
    //Task 5: Reverse the elements of an array {10, 20, 30, 40, 50} and print the reversed array.
    int[] arrs={10,20,30,40,50};
    int start=0;
    int end=arrs.length-1;
    while(start<end){
        int temp=arrs[start];
        arrs[start]=arrs[end];
        arrs[end]=temp;
        start++;
        end--;
    }
    System.out.println("Reversed Array:");
    for(int i=0;i<arrs.length;i++){
        System.out.print(arrs[i] + " ");
    }
}

}
