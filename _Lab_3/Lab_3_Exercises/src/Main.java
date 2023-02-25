import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double outerRadius, innerRadius;
        double area;

        System.out.println("Enter radius of outer circle: ");
        outerRadius = input.nextDouble();
        System.out.println("Enter radius of inner circle (the hole): ");
        innerRadius = input.nextDouble();
        area = computeArea(outerRadius) - computeArea(innerRadius);

        if (area < 0) {
            System.out.println("Invalid input.");
        } else {
            System.out.println("Area of ring is: " + area);
        }
    }

    public static double computeArea(double radius) {
        double area;
        area = Math.pow(radius, 2.0) * Math.PI;
        return area;
    }
}