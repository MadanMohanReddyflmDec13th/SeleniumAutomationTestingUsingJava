package generalPrograms;

public class PalindromOrNot {

	public static void main(String[] args) {
		
		int num=1234321; 
		int res=0;
		int rem;
		int temp=num;
		
		while(num>0)
		{
			rem=num%10;
			res=res*10+rem;
			num=num/10;
		}
		
		if(res==temp)
		{
			System.out.println("Palimdrome");
		}
		else
		{
			System.out.println("Not Palindrome");
		}
	}
}
