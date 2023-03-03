import java.util.Scanner;

public class FindPower {
    public static void main(String[] args) {
        //Problem 10: Find X to the power 'N'.

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of 'X': ");
        int X = sc.nextInt();
        System.out.print("Enter the value of 'N': ");
        int N = sc.nextInt();
        findPower(X,N);
    }
    static void findPower(int x, int n) {
        int power = 1;
        for (int i=1; i<=n; i++) {
            power *= x;
        }
        System.out.print(power);
    }
}
