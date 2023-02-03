
public class TopicReverseAnArray {
    static void reverse(int [] arr, int n) {
        int i,k;
        for (i=0; i<n/2; i++) {
            k = arr[i];
            arr[i] = arr[n-i-1];
            arr[n-i-1] = k;
        }
        for (i=0; i<6; i++) {
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        int[]arr = {1,2,3,4,5,6};
        reverse(arr,6);
    }
}
