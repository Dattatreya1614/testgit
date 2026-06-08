package tnscom.superkey;

public class Armstrong {

	public static void main(String[] args) {
		
int num =153;
       int temp =num;
       int count=0;
       while (num!=0) {
       num =num/10;
      count++;
      num =temp;}
	int exp= count;
	int sum =0;
	while (num!=0) {
		int base= num%10;
		int power =1;
		for (int i=1;i<=exp;i++) 
	{ 
			power =power&base;
	} 
		sum =sum+power;
	num =num%10;
} if (sum ==temp) {
	System.out.println("arm strong number");
} else {
	System.out.println("not a arm strong number");
}
	}
}

