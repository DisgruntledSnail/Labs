/*
    Jeff Chadrick
    CSCI2467 WEB73351
    Feb. 03, 2023
    BMI Calculator
 */

import java.util.Scanner;
import java.lang.Math;
public class Main {

    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        double inches, pounds, meters, kilograms, bmi;
        String classification;

        System.out.println("\t\tBMI Calculator\n");

        System.out.print("Please enter your height (inches): ");
        inches = input.nextDouble();
        System.out.print("Please enter your weight (pounds): ");
        pounds = input.nextDouble();

        kilograms = convertToKilograms(pounds);
        meters = convertToMeters(inches);
        bmi = calcBMI(kilograms, meters);
        classification = bmiClassification(bmi);

        classOutput(bmi, classification);
    }

    public static double convertToKilograms (double pounds) {
        double kilograms = pounds / 2.20462;
        return kilograms;
    }

    public static double convertToMeters (double inches) {
        double meters = inches / 39.37;
        return meters;
    }

    public static double calcBMI (double kilograms, double meters) {
        double bmi = kilograms / Math.pow(meters,2);
        return bmi;
    }

    public static String bmiClassification (double bmi) {
        String classification;
        if (bmi < 18.5){
            classification = "Underweight";
        } else if (bmi < 25.0) {
            classification = "Normal";
        } else if (bmi < 30.0) {
            classification = "Overweight";
        } else {
            classification = "Obese";
        }
        return classification;
    }

    public static void classOutput (double bmi, String classification) {
        System.out.println("Your BMI is: " + bmi);
        System.out.println("Your BMI classification is: " + classification);
    }
}