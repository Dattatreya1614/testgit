package tnscom.superkey;

import java.util.Scanner;

public class factorial {

	

	public static void main(String[] args) {
		  Scanner scanner = new Scanner(System.in);
	        
	        System.out.print("Enter a factorial: ");
	        int num = scanner.nextInt();
	        
	        
	        if (num < 0) {
	            System.out.println(" Factorial is  numbers.");
	        } else {
	            long factorial = 1; 
	            
	            for (int i = 1; i <= num; i++) {
	                factorial *= i;
	            }
	            
	            System.out.println("The factorial of " + num + " is: " + factorial);
	        }
	        
	        
	    }
	}