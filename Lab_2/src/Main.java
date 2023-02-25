import java.util.Scanner;

/*
    Jeff Chadrick
    January 28, 2023
    CSCI2467 WEB73351
    Determines the category of a hurricane based on wind speed entered by user.
 */

public class Main {
    public static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
            long speed;
            String classification;
            System.out.print("Enter your wind speed (mph): ");
            speed = input.nextInt();

            if (speed < 0) {
                classification = "Invalid input.";
            } else if (speed <= 38) {
                classification = "Not a Hurricane.";
            } else if (speed <= 73) {
                classification = "Tropical Storm.";
            } else if (speed <= 95) {
                classification = "Category 1.";
            } else if (speed <= 110) {
                classification = "Category 2.";
            } else if (speed <= 129) {
                classification = "Category 3.";
            } else if (speed <= 156) {
                classification = "Category 4.";
            } else {
                classification = "Category 5.";
            }

        System.out.println("Category: " + classification);
    }
}