package stringprograms;

import java.util.HashMap;

public class OccuranceofeachCharacterinaString {

	public static void main(String[] args) {
		
		String s="aabbbcccc";
		
		HashMap<Character,Integer> hMap=new HashMap<Character, Integer>();

		for(int i=0;i<s.length();i++)
		{
			char ch=s.charAt(i);
			
			if(hMap.containsKey(ch))
			{
				//int count=map.get(ch);
				//count++;
				//map.replace(ch, count);
				hMap.put(ch, hMap.get(ch)+1);
			}
			else 
			{
				hMap.put(ch,1);
			}
		}
		
		System.out.println(hMap);
	}

}   


