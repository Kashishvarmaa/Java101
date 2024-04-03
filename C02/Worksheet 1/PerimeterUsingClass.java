/*. Find the perimeter of a circle using class, object and methods
( hint: 2* Math.PI *radius) */

import java.util.Scanner;
class circle{
    double radius, perimeter,area;
    void getval(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the radius: ");
        radius = sc.nextDouble();
    }
    public double calPer(){
        perimeter = 2*Math.PI * radius;
        return perimeter;
    }
    public double calArea(){
        area = Math.PI*radius*radius;
        return area;
    }
}
public class PerimeterUsingClass{
    public static void main(String[] args){
        circle c1 = new circle();
        c1.getval();
        double per = c1.calPer();
        double are = c1.calArea();
        System.out.println(per);
        System.out.print(are);
    }
}