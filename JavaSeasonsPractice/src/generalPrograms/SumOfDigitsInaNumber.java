package generalPrograms;

public class SumOfDigitsInaNumber {

	public static void main(String[] args) {

		int num= 12345;
		int rem;
		int sum=0;
		
		while(num>0)
		{
			rem=num%10;
			sum=sum+rem;
			num=num/10;
		}
		
		System.out.println("Sum of all digits in a given number is :"+sum);	 
	}
}
