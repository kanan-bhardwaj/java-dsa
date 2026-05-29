import java.util.Arrays;
import java.util.Scanner;
public class SumArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of an array: ");
        int n  = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Array Of Elements: ");

        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(arr));

        int ans = sumArray(arr);

        System.out.println("Sum of Array: " + ans);
    }
    static int sumArray(int[] arr){
        int sum = 0;
        for(int i=0; i<arr.length; i++){
            sum += arr[i];
        }
        return sum;
    }
}
