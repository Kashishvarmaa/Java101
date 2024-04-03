/* A retail store management now wants to provide discount based on following scenario.
 Write a java code to implement the same using class, objects and methods.
 Bill amount       Discount %
 >=1000                 5
 >=500 and <1000        2
 >0 and <500            1 */
import java.util.Scanner;
class discount{
    double discount, total;
    double CalDiscount(double amount){
        if(amount>=1000){
            discount = amount*0.05;
        }
        else if(amount<1000 && amount>=500){
            discount = amount*0.02;
        }
        else if(amount<500 && amount>0){
            discount = amount*0.01;
        }
        else{
            System.out.print("Not Valid!");
        }
        total = amount - discount;
        return total;
    }}
public class DiscountUsingClass {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter you bill amount: ");
        double bill = sc.nextDouble();
        discount dis = new discount();

        double value = dis.CalDiscount(bill);
        System.out.print("You total bill was "+ bill+ "with discount your total bill is "+ value);
    }}




