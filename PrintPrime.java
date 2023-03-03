
import java.util.Scanner;

public class PrintPrime {
    public static void main(String[] args) {
        //Problem 13: WAP to print all prime number b/w two given numbers.

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the starting number: ");
        int n = sc.nextInt();
        System.out.print("Enter the End number: ");
        int m = sc.nextInt();
        printPrimeNumber(n,m);
    }
    static void printPrimeNumber(int n, int m) {
        int flag;
        for (int i=n; i<=m; i++) {
            if (i==1 || i==0)
                continue;
                flag = 1;

                for (int j=2; j<=i/2; ++j) {
                    if (i%j==0) {
                        flag = 0;
                        break;
                }
            }
                if (flag == 1){
                    System.out.print(i+" ");
                }
        }
    }
}
