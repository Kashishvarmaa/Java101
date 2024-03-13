//Write a program to calculate the average marks of a student ( i.e.- assign m1,m2,m3,m4 & m5)
import java.util.Scanner;
public class AverageMarks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = sc.next();
        System.out.print("Enter your Subject 1 marks: ");
        Double m1 = sc.nextDouble();
        System.out.print("Enter your Subject 2 marks: ");
        Double m2 = sc.nextDouble();
        System.out.print("Enter your Subject 3 marks: ");
        Double m3 = sc.nextDouble();
        System.out.print("Enter your Subject 4 marks: ");
        Double m4 = sc.nextDouble();
        System.out.print("Enter your Subject 5 marks: ");
        Double m5 = sc.nextDouble();

        Double average = (m1+m2+m3+m4+m5)/5;

        System.out.println(name+ " has scored "+ m1 +" in subject 1, "+ m2 +" in subject 2, "+ m3 +" in subject 3, "+ m4 +" in subject 4, "+ m5 +" in subject 5, " );
        System.out.print("The average score is "+ average);

    }
}

