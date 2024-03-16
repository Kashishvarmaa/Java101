//Write a java program to perform arithmetic operation using switch case
import java.util.Scanner;
public class ArithmeticUsingSwitch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int a = sc.nextInt();
        System.out.print("Enter the second number: ");
        int b = sc.nextInt();
        System.out.println("Enter the function you want to perform: ");
        System.out.println("For addition choose 1 ");
        System.out.println("For subtraction choose 2 ");
        System.out.println("For multiplication choose 3 ");
        System.out.println("For division choose 4 ");
        System.out.println("Enter the number:");
        int n = sc.nextInt();
        switch (n) {
            case 1:
                System.out.println(a + b);
                break;
            case 2:
                System.out.println(a - b);
                break;
            case 3:
                System.out.println(a * b);
                break;
            case 4:
                if (b != 0) {
                    System.out.println(a / b);
                    break;
                } else {
                    System.out.println("b is equal to 0");
                    break;
                }
            default:
                System.out.println("Enter the right nuumber");
                break;
        }
    }
}
