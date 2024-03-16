// Write a java code to create to calculate perimeter of rectangle
import java.util.Scanner;
public class PerimeterOfRectangle  {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length: ");
        int l = sc.nextInt();
        System.out.print("Enter the length: ");
        int b = sc.nextInt();

        if(l<=0 && b<=0){
            System.out.print("Enter a valid number");
        }
        else{
            int peri = 0;
            peri = 2*(l*b);
            System.out.print("The perimeter of rectangle is: " + peri);
        }
    }
}
