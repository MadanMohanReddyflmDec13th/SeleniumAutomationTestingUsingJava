package stringprograms;

public class CountOfVowlesAndConsonantsInAGivenString {

	public static void main(String[] args) {
		
		String ip="Madan Mohan Reddy";
		ip=ip.toLowerCase();
		
		int vowelCount=0;
		int consonantsCount=0;
		
		for(int i=0; i<ip.length(); i++)
		{
			char ch=ip.charAt(i);
			
			if(ch==' ')
			{
				continue;
			}
			else if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')
			{
				vowelCount+=1;			
			}
			else
			{
				consonantsCount+=1;
			}	
		
			/*
			if(Character.isLetter(ch))
			{
				if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')
				{
					vowelCount+=1;	
				}
				else
				{
					constantsCount+=1;
				}
			}
			*/
		}
		System.out.println(vowelCount);
		System.out.println(consonantsCount);	
	} 	
} 
 