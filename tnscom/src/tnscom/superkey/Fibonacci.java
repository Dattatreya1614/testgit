package tnscom.superkey;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("enter a range ");
		int range =sc.nextInt();
		int a =0;
		int b =1;
		for (int i=1;i<=range;i++);{
			System.out.println(a+ "");
			int sum =a+b;
			a=b;
			b=sum;
		}
		
	}

}
