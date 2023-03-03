public class OddEvenInArray {
    public static void main(String[] args) {
        //Program 8: Find sum of even digits and odd digits in an array.

        int[]arr = {1,2,3,4,5,6,7,8,9};
        findEvenSum(arr);
    }
    static void findEvenSum(int[]arr) {
        int evenSum = 0, oddSum = 0;
        for (int j : arr) {
            if (j%2==0) {
                evenSum += j;
            } else {
                oddSum += j;
            }
        }

        System.out.print(evenSum+" "+oddSum);
    }
}
