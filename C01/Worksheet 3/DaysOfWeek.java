import java.util.Scanner;
public class DaysOfWeek {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();

        switch(n){
            case 1:
                System.out.print("The day is monday");
                break;
            case 2:
                System.out.print("The day is Tuesday");
                break;
            case 3:
                System.out.print("The day is wednesday");
                break;
            case 4:
                System.out.print("The day is Thursday");
                break;
            case 5:
                System.out.print("The day is Friday");
                break;
            case 6:
                System.out.print("The day is Saturday");
                break;
            case 7:
                System.out.print("The day is Sunday");
                break;
            default:
                System.out.print("Please enter a valid number");

        }

    }
}

