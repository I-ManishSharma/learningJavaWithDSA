import java.util.Scanner;

public class problem11 {
    public static void main(String[] args) {
        //Problem 11: Find the sum of even digits and odd digits separately.

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = sc.nextInt();
        findSum(num);
    }
    public static void findSum(int num) {
        int evenSum = 0, oddSum = 0;
        while(num!=0) {
            int n = num%10;
            if (n%2==0) {
                evenSum += n;
            } else {
                oddSum += n;
            }
           num = num/10;
        }
        System.out.println(evenSum+" "+oddSum);
    }
}
