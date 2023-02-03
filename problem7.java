import java.util.Scanner;

public class problem7 {
    public static void main(String[] args) {
        /*Problem 6: WAP to find the index of the first and last occurrence of the element X in the array and if
        it is not present, return -1.*/

        Scanner sc = new Scanner(System.in);
        int[]arr = {2,3,4,5,6,5,5,2,6};
        System.out.print("Enter the element: ");
        int num = sc.nextInt();
        System.out.println(firstIndex(arr,num));
        System.out.println(lastIndex(arr,num));
    }
    static int firstIndex(int[]arr, int num) {
        int firstIndex;
        for (int i = 0; i < arr.length; i++)
            if (arr[i] == num)
                return i;
            return -1;
    }
    static int lastIndex(int[]arr, int num) {
        int lastIndex = -1;
        for (int i=0; i< arr.length; i++) {
            if (arr[i]==num) {
                lastIndex = i;
            }
        }
        if (lastIndex!=-1)
            return lastIndex;
        return lastIndex;
    }
}
