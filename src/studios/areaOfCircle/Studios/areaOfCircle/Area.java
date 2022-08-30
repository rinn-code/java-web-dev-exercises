package Studios.areaOfCircle;
import java.util.Scanner;
import Studios.areaOfCircle.Circle;

public class Area {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter Radius: ");
        double radius = input.nextDouble();

        double area = Circle.getArea(radius);
       // System.out.println("The area of a circle of radius " + radius + " is " + area);
        if (radius <= 0) {
            System.out.println("Error: Must be positive Number");
        } else {
            System.out.println("The area of a circle of radius " + radius + " is " + area);
        }
    }
}