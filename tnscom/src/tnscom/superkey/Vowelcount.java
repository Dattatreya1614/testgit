package tnscom.superkey;

public class Vowelcount {

	public static void main(String[] args) {
		
		        String s = "Hello";
		        int vowelCount = 0;
		        String lowerCaseStr = s.toLowerCase();
		      for (int i = 0; i < lowerCaseStr.length(); i++) {
		            char ch = lowerCaseStr.charAt(i);
		             if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
		                vowelCount++;
		            }
		        }
		        System.out.println("Original String: " + s);
		        System.out.println("Number of vowels: " + vowelCount);
		    }
		
	}


