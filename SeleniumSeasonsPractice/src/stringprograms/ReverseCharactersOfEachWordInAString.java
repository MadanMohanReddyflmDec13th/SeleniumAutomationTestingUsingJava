package stringprograms;

public class ReverseCharactersOfEachWordInAString {

	public static void main(String[] args) 
	{

		String input = "Learning Java is easy";
		String result= "";
		String[] words=input.split(" ");
		
		for(int i=0;i<words.length;i++)
		{
			String reversedWord="";
			for(int j=words[i].length()-1;j>=0;j--)
			{
				reversedWord= reversedWord+words[i].charAt(j);
			}
			
			result= result+reversedWord;
			
			if(i!=words.length-1)
			{
				result+=" ";
			}
		}
		
		System.out.println(input);
		System.out.println(result);
		
	}

}
   