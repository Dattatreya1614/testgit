package tnscom.superkey;

public class Animal {
	 String color = "white";
	    public void sound()
	    {
	        System.out.println("Animal makes sound");
	    }
	    Animal()
	    {
	        System.out.println("this is animal constructor");
	    }
	}
	class Dog extends Animal{
	    String colour = "brown";
	    public void sound()
	    {
	        System.out.println("Dog barks");
	        System.out.println("The colour of animal is:"+super.color);
	        super.sound();
	    }
	    Dog()
	    {
	        System.out.println("this is dog constructor");
	    }
	}

	
		

	


