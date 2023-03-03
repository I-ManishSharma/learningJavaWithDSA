import java.util.Scanner;

public class PairSumInArray {
    public static void main(String[] args) {
        //Problem 4: Count pair with given sum in the array.
        Scanner sc = new Scanner(System.in);
        int[]arr = {22,33,44,55,11,33};
        System.out.println("Enter the sum of pair: ");
        int num = sc.nextInt();
        int count = 0;
        for (int i=0; i< arr.length; i++) {
            for (int j=i+1; j< arr.length; j++) {
                if(arr[i]+arr[j]==num) {
                    count++;
                    System.out.println(arr[i]+" "+arr[j]);
                }
            }
        }
        System.out.print(count);
    }
}
