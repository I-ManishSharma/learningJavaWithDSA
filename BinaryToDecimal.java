import java.util.Scanner;
public class BinaryToDecimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the binary number: ");
        int binaryNumber = sc.nextInt();
        int ans = 0;  //convert decimal number
        int pw = 1;  // 2 ^ 0 = 1 power of 2

        while (binaryNumber > 0) {
            int unitDigit = binaryNumber % 10;
            ans += unitDigit * pw;
            binaryNumber /= 10;
            pw *= 2;
        }
        System.out.println(ans);
    }
}
