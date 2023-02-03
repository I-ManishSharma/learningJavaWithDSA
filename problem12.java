import java.util.Scanner;

public class problem12 {
    public static void main(String[] args) {
        //WAP to check the number is prime or not.

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = sc.nextInt();
        isPrime(num);
    }

    static void isPrime(int num) {
        int m = num/2;
        boolean flag = true;
        if (num==0 || num==1) {
            flag = false;
        } else {
            for (int i=2; i<=m; i++) {
                if (num%i==0){
                   flag = false;
                   break;
                }
            }
        }
        if (flag==true) {
            System.out.println("Prime");
        } else {
            System.out.println("Not Prime");
        }
    }
}
