package bmiCalculate;

import java.text.DecimalFormat;
import java.util.Scanner;

/*
 * This is a program that calculates your BMI score
 */
public class BmiCalculator {

	public static void main(String[] args) {
		
		Scanner userInput = new Scanner(System.in);
		boolean calculateBMI = true;
		
		
		while (true) {
			double weight = 0;
			double height = 0;
			boolean validInput;
			
			do {
				System.out.println("Enter your Weight in kilograms (kg): ");
				weight = userInput.nextDouble();
				validInput = weight > 0;
				if(!validInput) {
					System.out.println("Enter a valid number between 0,5 and 22");
				}

			}while (!validInput);
			do {
				System.out.println("Enter your height in meters: ");
				height = userInput.nextDouble();
				if (!validInput) {
					System.out.println("Enter a valid number:");
				}
			}while (!validInput);
			
				
			double bmi = weight / (height * height) * 703;
			
			DecimalFormat df = new DecimalFormat("0.0");
			
			System.out.println("Your BMI is: " + df.format(bmi));
			
			if (bmi <= 16.0) {
				System.out.println("Severely Underweight");
			}else if (bmi <= 18.4) {
				System.out.println("Underweight");
			}else if (bmi <= 24.9) {
				System.out.println("Normal");
			}else if (bmi <= 29.9) {
				System.out.println("Overweight");
			}else if (bmi <= 34.9) {
				System.out.println("Moderately Obese");
			}else if (bmi <= 39.9) {
				System.out.println("Severely Obese");
			}else {
				System.out.println("Morbidly Obese");
				
			}
			System.out.println("Do you want to calculate the BMI again? (Y/N)");
			String response = userInput.next().toLowerCase();
			if(response.equalsIgnoreCase("Y")) {
				calculateBMI = true;
			}else {
				System.out.println("Thank you for using the BMI Calculator. GoodBye!");
				break;
			}
//			userInput.close();
			}
	}
}