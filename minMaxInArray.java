import java.util.Scanner;

public class minMaxInArray {
    public static void main(String[] args) {
        //Problem 3: Find maximum and minimum in an array.

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements in the array : ");
        int n = sc.nextInt();
        int[]arr = new int[n];
        System.out.print("Enter the elements of the array : ");
        for (int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
        }
        int max = arr[0];
        int min = arr[0];
        for (int j : arr) {
            if (max < j)
                max = j;
            if (min > j)
                min = j;
        }
        System.out.println("Maximum : "+max+ " Minimum : "+ min);
    }
}
