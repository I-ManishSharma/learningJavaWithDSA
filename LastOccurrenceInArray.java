import java.util.Scanner;

public class LastOccurrenceInArray {
    public static void main(String[] args) {
        //Problem 6: WAP to find the index of the last occurrence of the element X in the array and if
        //        it is not present, return -1.

        Scanner sc = new Scanner(System.in);
        int[]arr = {2,3,4,5,5,5,2,6};
        System.out.print("Enter the element to be checked: ");
        int num = sc.nextInt();
        check(arr,num);
    }
    static void check(int[]arr,int num) {
        int lastIndex = -1;
        for (int i = 0; i< arr.length; i++) {
            if (arr[i]==num) {
                lastIndex = i;
            }
        }
        if (lastIndex!=-1) {
            System.out.print("Last index of element is: "+lastIndex);
        } else {
            System.out.print(lastIndex);
        }
    }
}
