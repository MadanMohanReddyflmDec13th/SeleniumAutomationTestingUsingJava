package stringprograms;

public class CountNoOfCharactersInAString {

	public static void main(String[] args) {
		
		String s= "selenium";
		int count=0;
		
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)!=' ')
			{
				count+=1;
			}
		}
		
		System.out.println("No of characters in a String: " + count);

	}
} 
