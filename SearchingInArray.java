import java.util.Scanner;

public class SearchingInArray {
    public static void main(String[] args) {
        //Problem 2 : find an element is present in an array or not.

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of element in an array : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter the elements of an array : ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter the element to be search in the array : ");
        int x = sc.nextInt();
        int result = search(arr,arr.length,x);
        if (result==-1) {
            System.out.println("Element not present.");
        } else {
            System.out.println("Element is present at index "+result);
        }
    }
    static int search(int[]arr, int n, int x) {
        int i;
        for (i=0; i<n; i++)
            if (arr[i]==x)
                return i;
        return -1;
    }
}
