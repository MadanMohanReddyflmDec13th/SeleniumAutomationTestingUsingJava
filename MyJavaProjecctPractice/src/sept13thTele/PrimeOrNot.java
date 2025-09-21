package sept13thTele;
import java.util.Scanner;
public class PrimeOrNot {

	public static void main(String[] args) {

		System.out.println("Enter a number: ");
		Scanner inp = new Scanner(System.in);
		int num = inp.nextInt();
		
		int count=0;
		
		for (int i = 2; i <= num / 2; i++) 
		{
			if (num % i == 0) 
			{
				count+=1;
				break;
				
			}	
			
		}
		
		if(num<=1)
		{
			System.out.println("Not a Prime");
		}
		else if(count==0)
		{
			System.out.println("It is Prime");
		}
		else
		{
			System.out.println("Not a Prime");
		}

	}

}
