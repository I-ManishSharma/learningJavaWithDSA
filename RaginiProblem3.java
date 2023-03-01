import java.util.Scanner;
public class RaginiProblem3 {
    public static void main(String[] args) {
        //WAP in java to find factorial of a number.
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num, fact=1;
        num = sc.nextInt();
        for (int i=1; i<=num; i++) {
            fact *=i;
        }
        System.out.println("Factorial of "+num+": "+fact);
    }
}
