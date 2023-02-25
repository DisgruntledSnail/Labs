/*  Jeff Chadrick
    Lab 1
    Jan. 21, 2023
    CSCI2466 WEB73351
 */

import java.util.Scanner;

public class Main {
        private static Scanner input = new Scanner(System.in);
        public static void main(String[] args) {
            System.out.print("Enter first number: ");
            double num_1 = input.nextDouble();

            System.out.print("Enter second number: ");
            double num_2 = input.nextDouble();

            System.out.print("Enter third number: ");
            double  num_3 = input.nextDouble();

            double ave = (num_1 + num_2 + num_3) / 3;
            System.out.printf("The average of %.2f, %.2f, and %.2f = %.2f", num_1 , num_2 , num_3 , ave);
    }
}