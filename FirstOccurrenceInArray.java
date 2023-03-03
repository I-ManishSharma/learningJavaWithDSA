import java.util.Scanner;

public class FirstOccurrenceInArray {
    public static void main(String[] args) {
        /*problem 5: WAP to find the index of the first occurrence of the element X in the array and if
        it is not present, return -1.*/

        Scanner sc = new Scanner(System.in);
        int[]arr = {2,3,4,5,3,2,5};
        System.out.println("Enter the Element you want to search: ");
        int num = sc.nextInt();
        int result = check(arr, arr.length, num);
        if (result==-1) {
            System.out.println("Element not present in the array."+result);
        } else {
            System.out.println("Index of first occurrence of Element is : "+result);
        }
    }

    static int check (int[]arr, int n, int x) {
        int i;
        for (i=0; i< arr.length; i++)
            if (arr[i]==x)
                return i;
            return -1;
    }
}
