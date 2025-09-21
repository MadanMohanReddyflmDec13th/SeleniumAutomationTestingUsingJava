package stringprograms;

public class ReverseWordsofaString {

	public static void main(String[] args) 
	{

		String input = "Learn Java with ease";
		String output = "";
		String[] words = input.split(" ");
		
		for (int i=words.length-1; i>=0; i--)	
		{
			output= output+words[i]; 
			
			if(i!=0)
			{
				output= output+" ";
			}
		}
		
		System.out.println(input);
		System.out.println(output);
	}

}
