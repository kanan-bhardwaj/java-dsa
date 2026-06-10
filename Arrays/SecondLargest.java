import java.util.Scanner;
import java.util.Arrays;
public class SecondLargestArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter the array elements: ");
        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(arr));
        
        int result = secondlargest(arr);
           System.out.println("Element found: " + result);
    }
    static int secondlargest(int[] arr){
        int largest;
        int secondlargest;
        if(arr[0]>arr[1]){
            largest = arr[0];
            secondlargest = arr[1]; 
        }
        else{
            largest = arr[1];
            secondlargest = arr[0];
        }
        for(int i=2;i<arr.length;i++){
            if(arr[i]>largest){
                secondlargest=largest;
                largest = arr[i];
            }
            else if(arr[i]>secondlargest){
                secondlargest=arr[i];
            }
        }
        return secondlargest;
    }
    
}
