package tnscom.superkey;

public class Primenumber {
          public static boolean isPrime(int num) {
		     		        for (int i = 3; i * i <= num; i += 2) {
		            if (num % i == 0) {
		                return false; 
		            }
		        }
		        
		        return true; 
		    }

		    public static void main(String[] args) {
		        int testNumber = 67;
		        
		        if (isPrime(testNumber)) {
		            System.out.println(testNumber + " is a prime number.");
		        } else {
		            System.out.println(testNumber + " is not a prime number.");
		        }
		    }
		
}

