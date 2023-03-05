import java.util.Scanner;
public class AddAndMultiplyDecimalAndBinary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the decimal number: ");
        int decimalNumber = sc.nextInt();
        System.out.print("Enter the binary number: ");
        int binaryNumber = sc.nextInt();
        int ans = decimalNumber+convertBinary(binaryNumber);
        int ans1 = decimalNumber*convertBinary(binaryNumber);
        System.out.println(ans);
        System.out.println(ans1);
    }
    public static int convertBinary(int num) {
        int ans = 0, pw = 1;
        while (num > 0) {
            int unitNum = num%10;
            ans += unitNum*pw;
            pw *= 2;
            num /= 10;
        }
        return ans;
    }
}
