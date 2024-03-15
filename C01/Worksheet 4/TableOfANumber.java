// Write a program in Java to display the multiplication table of a given integer.
import java.util.Scanner;
public class TableOfANumber {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number you want the table for:");
        int n = sc.nextInt();

        for(int i=0;i<=10;i++){
            int res = i*n;
            System.out.println(res);
        }


    }
}
