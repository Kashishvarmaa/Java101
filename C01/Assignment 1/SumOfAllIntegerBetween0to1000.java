//Write a Java program that reads an integer between 0 and 1000 and adds all the digits in the integer.
import java.util.Scanner;
public class SumOfAllIntegerBetween0to1000 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number:");
        int n = sc.nextInt();
        int sum=0;
        for(int i=0;i<=n;i++){
            sum += i;
        }
        System.out.print(sum);
    }
}
