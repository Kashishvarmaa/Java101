//Write a Java program to get a number from the user and print whether it is positive or negative

import java.util.Scanner;
public class PositiveNegetive {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = sc.nextInt();

        if (num < 0) {
            System.out.print("The entered number is a negative number");
        } else {
            System.out.print("The entered number is a positive number");
        }
    }
}
