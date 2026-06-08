package tnscom.superkey;

public class Reverse {

	public static void main(String[] args) {
	
		        String s = "Programming";
		        String reversed = "";
		       
		        for (int i = s.length() - 1; i >= 0; i--) {
		            reversed += s.charAt(i); 
		        }
		        
		        System.out.println("Original: " + s);
		        System.out.println("Reversed: " + reversed);
		    }
		

	}


