package testgit1;
import java.util.Scanner;

public class SumCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Create a Scanner object to read user input
				Scanner scanner = new Scanner(System.in);
				
				System.out.println("--- Modular Sum Calculator ---");
				
				// Ask user for the first number
				System.out.print("Enter first number: ");
				int num1 = scanner.nextInt();
				
				// Ask user for the second number
				System.out.print("Enter second number: ");
				int num2 = scanner.nextInt();
				
				// Calculate the sum
				int sum = num1 + num2;
				
				// Print the final result
				System.out.println("The total sum is: " + sum);
				
				// Close the scanner resource
				scanner.close();

	}

}
