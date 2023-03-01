import java.util.Scanner;
public class RaginiProblem1 {
    public static void main(String[] args) {
        //WAP in java to print the sum of element of an array.
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of element in array: ");
        int n = sc.nextInt();
        int [] arr = new int[n];
        System.out.print("Enter the elements of array: ");
        for (int i = 0; i<n; i++) {
            arr[i] = sc.nextInt();
        }
        int sum = 0;
        for (int i = 0; i<n; i++) {
            sum += arr[i];
        }
        System.out.println("Sum of elements of array: "+sum);
    }
}
