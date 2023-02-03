
import java.util.Scanner;

public class menuDrivenProgram {
    public static int menu(){
        Scanner sc = new Scanner(System.in);
        System.out.println("1. Find Factorial of a number");
        System.out.println("2. Find if number is prime or not");
        System.out.println("3. Find if number is odd or even");
        System.out.println("4. Exit");
        System.out.println("--------------------------");
        System.out.print("Enter your choice: ");
        int choice = sc.nextInt();
        return choice;
    }
    static void cases(int choice) {
        Scanner sc = new Scanner(System.in);
        switch (choice) {
            case 1:
                int num, fact = 1;
                System.out.print("Enter the number: ");
                num = sc.nextInt();
                for (int i = 1; i <= num; i++) {
                    fact *= i;
                }
                System.out.println(fact);
                break;
            case 2:
                System.out.print("Enter the number: ");
                num = sc.nextInt();
                int m = num/2;
                boolean flag = true;
                if (num==0 || num==1) {
                    flag = false;
                } else {
                    for (int i = 2; i<=m; i++) {
                        if (num%i==0) {
                            flag = false;
                            break;
                        }
                    }
                }

                if (flag) {
                    System.out.println("Prime");
                } else {
                    System.out.println("Not Prime");
                }
                break;
            case 3:
                System.out.print("Enter the number: ");
                num = sc.nextInt();
                if (num%2==0) {
                    System.out.println("Even");
                } else {
                    System.out.println("Odd");
                }
                break;
            case 4:
                System.out.println("Exit");
                break;
        }
    }
    public static void main(String[] args) {
        cases(menu());
    }
}
