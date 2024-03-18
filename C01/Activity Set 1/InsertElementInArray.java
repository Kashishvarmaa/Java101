//Java Programming Code to Insert Element in Array
import java.util.Scanner;

public class InsertElementInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of the array: ");
        int len = sc.nextInt();
        int[] arr = new int[len + 1];
        for (int i = 1; i <= len; i++) {
            System.out.print("Enter the Element: ");
            int ele = sc.nextInt();
            System.out.print("Enter the position: ");
            int pos = sc.nextInt();

            if (pos >= 1 && pos <= len + 1) {
                arr[pos] = ele;
                i++;
            } else {
                System.out.println("Enter a valid position");
            }
        }
        System.out.print("Elements are: ");
        for (int i = 1; i <= len; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
