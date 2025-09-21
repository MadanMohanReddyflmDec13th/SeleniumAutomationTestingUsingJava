package stringprograms;

import java.util.HashMap;
import java.util.Map.Entry;
//import java.util.Set;

public class CharacterWithHighestFrequencyinaString {

	public static void main(String[] args) {
		
		String s ="available";
		
		HashMap<Character, Integer> hMap  = new HashMap<Character, Integer>();

		for(int i=0; i<s.length(); i++)
		{
			char ch=s.charAt(i);
			
			if(hMap.containsKey(ch))
			{
				hMap.put(ch, hMap.get(ch)+1);
			}
			else
			{
				hMap.put(ch, 1);
			}
		
		}
		
		//System.out.println(hMap);
		
		//Character with Highest Frequency in a  string
		char maxChar = ' ';
		int maxCount = 0;

		for (Entry<Character, Integer> entry : hMap.entrySet()) 
		{
		    if (entry.getValue() > maxCount) {
		        maxChar = entry.getKey();
		        maxCount = entry.getValue();
		    }
		} 

		System.out.println("Character with highest frequency: " + maxChar + " → " + maxCount);
		
		
	}

}
