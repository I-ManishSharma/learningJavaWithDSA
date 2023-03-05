import java.util.Scanner;
public class DecimalToBinary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Decimal number: ");
        int decimalNumber = sc.nextInt();
        int ans = 0;
        int pw = 1;

        while (decimalNumber > 0) {
            int unitNumber = decimalNumber % 2;
            ans += unitNumber * pw;
            decimalNumber /= 2;
            pw *= 10;
        }
        System.out.println(ans);
    }
}

