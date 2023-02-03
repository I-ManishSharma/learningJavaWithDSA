
public class problem1 {
    public static void main(String[] args) {
        //Problem 1 : Add elements of two array.

        int[]arr1 = {15,24,6,9,7};
        int[]arr2 = {65,25,5,98,7};
        int result = 0;
        for (int j : arr1) {
            result += j;
        }
        for (int j : arr2) {
            result += j;
        }
        System.out.println(result);
    }
}
