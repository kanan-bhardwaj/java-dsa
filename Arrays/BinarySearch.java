import java.util.Arrays;
import java.util.Scanner;
public class BinarySearch {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the size of an array: ");
    int n = sc.nextInt();

    int[] arr = new int[n]; // This creates an empty array
    System.out.println("Array of elements: ");
    for(int i=0;i<arr.length;i++){
        arr[i] = sc.nextInt();
    }
    Arrays.sort(arr);
    System.out.println(Arrays.toString(arr));

    System.out.println("Enter the target value: ");
    int target = sc.nextInt();

    int result = Binary(arr,target,n);
    if(result==-1){
        System.out.println("Target not found");
    }
    else{
        System.out.println("Target found at index: " + result);
    }
    }
    static int Binary(int[] arr,int target,int n){
        int low = 0;
        int high = n - 1;

        while(low<=high){
            int mid = (low+high)/2;
            if(arr[mid]==target){
                return mid;
            }
            else if (arr[mid] < target){
              low=mid+1;
            }
            else{
              high=mid-1;
            }    
        }
        return -1;
    }
}
