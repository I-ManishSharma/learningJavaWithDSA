import java.util.Scanner;
public class RaginiProblem2 {
    public static void main(String[] args) {
        //WAP in Java to find the sum of even and odd number from a given range.
        Scanner sc = new Scanner(System.in);
        int n1, n2, evenSum =0, oddSum = 0;
        System.out.print("Enter the first number: ");
        n1 = sc.nextInt();
        System.out.print("Enter the second number: ");
        n2 = sc.nextInt();

        for (int i=n1; i<=n2; i++) {
            if (i%2==0) {
                evenSum +=i;
            } else {
                oddSum +=i;
            }
        }
        System.out.println("Sum of all even numbers between "+n1+" and "+n2+": "+evenSum);
        System.out.println("Sum of all odd numbers between "+n1+" and "+n2+": "+oddSum);
    }
}
