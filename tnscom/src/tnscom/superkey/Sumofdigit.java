package tnscom.superkey;

import java.util.Scanner;

public class Sumofdigit {
 public static void main(String[] args) {
		        // Create a Scanner object for user input
		       Scanner sc = new Scanner(System.in);
		        
		        System.out.print("Enter a number: ");
		        int num = sc.nextInt();
		        int originalNum = num;
		        int sum = 0;
		        num =(num);
		        while (num > 0) {
		            int lastDigit = num % 10; 
		            sum += lastDigit;         
		            num = num / 10;           
		        }
		        System.out.println("The sum of digits of " + originalNum + " is: " + sum);
		        
		       
		    }
		
	}


