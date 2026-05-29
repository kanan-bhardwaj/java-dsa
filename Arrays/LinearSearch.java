import java.util.Scanner;
import java.util.Arrays;
public class LinearSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];  // This creates an empty array
        System.out.println("Array of elements: ");
        for(int i=0;i<arr.length;i++){
             arr[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(arr));
        
        System.out.println("Take the target value: ");
        int target = sc.nextInt();
        //int[] arr = {2,4,6,8};
        //int target = 6;
        int result = linearSearch(arr,target);
        if(result == -1){
            System.out.println("Element not found.");
        }
        else{
            System.out.println("Element found at index: " + result);
        }
    }
static int linearSearch(int[] arr, int target){
    for(int i=0;i<arr.length;i++){
        if(arr[i] == target){
            return i;
        }
    }
    return -1;
}
}
