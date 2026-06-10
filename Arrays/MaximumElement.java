import java.util.Scanner;
public class MaxArray {
    public static void main(String[] args) {
       // int[] arr = {2,3,4,5,6};
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of an array: ");
        int n  = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter Elements: ");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
    int result = max(arr);
    System.out.println("Maximum element: " + result);
}
    static int max(int[] arr){
        int maxval = arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]>maxval){
                maxval = arr[i];
            }
        }
        return maxval;
    }
    
}
