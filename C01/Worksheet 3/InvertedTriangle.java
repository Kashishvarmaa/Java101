import java.util.Scanner;
public class InvertedTriangle  {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input the number: ");
        int number = scanner.nextInt();

        for (int i = 0; i < number; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < number - i; k++) {
                System.out.print("*");
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}

