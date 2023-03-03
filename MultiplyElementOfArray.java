public class MultiplyElementOfArray {
    public static void main(String[] args) {
        //Problem 9: Multiply the elements of array.

        int[]arr = {2,3,5,6};
        multiply(arr);
    }
    static void multiply(int[]arr) {
        int multiply = 1;
        for (int i : arr) {
            multiply *= i;
        }
        System.out.println(multiply);
    }
}
