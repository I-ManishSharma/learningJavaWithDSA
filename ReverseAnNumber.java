import java.util.Scanner;

public class ReverseAnNumber {
    public static void main(String[] args) {

        //Problem : Reverse a number. eg- 25 is reversed as 52.
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = sc.nextInt();
        System.out.println(reverseNumber(num));
    }
    static int reverseNumber(int num) {
        int ans = 0;
        while (num!=0) {
            int i = num%10;
            ans = ans * 10 + i;
            num = num/10;
        }
        if (ans > Integer.MAX_VALUE/10 || ans < Integer.MIN_VALUE/10)
            return 0;
        return ans;
    }
}
