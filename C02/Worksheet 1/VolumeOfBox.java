// Volume of a box using parameters and return value in method
public class VolumeOfBox {
     static double calculateVolume(double length, double width, double height) {
        double volume = length * width * height;
        return volume;
    }
    public static void main(String[] args) {
        double length = 5.0;
        double width = 3.0;
        double height = 2.0;

        double volume = calculateVolume(length, width, height);

        System.out.println("The volume of the box is: " + volume);
    }
}

