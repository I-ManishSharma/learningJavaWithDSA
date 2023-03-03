import java.util.Arrays;
public class BubbleSortInArray {
    public static void main(String[] args) {
        int [] arr = {5,2,1,7,9,3};
        int n = arr.length;
        System.out.println("Unsorted Array: "+Arrays.toString(arr));
        for (int i=0; i<n; i++) {
            for (int j=0; j<n-i-1; j++) {
                if (arr[j]>arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        System.out.println("Sorted Array: "+Arrays.toString(arr));
    }
}
