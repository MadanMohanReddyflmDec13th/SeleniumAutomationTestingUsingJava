package stringprograms;

import java.util.HashMap;
import java.util.Map;

public class Roughwork 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		/*
		String str="aabbcccddaa";
		
		Map<Character, Integer> hMap=new HashMap<Character, Integer>();
		
		for(int i=0;i<str.length();i++)
		{
			
			char ch=str.charAt(i);
			
			if(hMap.containsKey(ch))
			{
				hMap.put(ch, hMap.get(ch)+1);
			}
			else
			{
				hMap.put(ch, 1);
			}		
		}
		System.out.print(hMap);	
		*/
		
		/*
		//count of Vowels and consonants in a String
		String s="Selenium";
		s=s.toLowerCase();
	
		int vowelCount=0;
		int consonantCount=0;
		
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)==' ')
			{
				continue;	
			}
			else if(s.charAt(i)=='a' || s.charAt(i)=='e' || s.charAt(i)=='i' || s.charAt(i)=='o' || s.charAt(i)=='u')
			{
				vowelCount+=1;
			}
			else
			{
				consonantCount+=1;
			}
		}
		System.out.println(vowelCount);
		System.out.println(consonantCount);	
		*/
		
		//Reverse string by preserving its spaces
		/*
		String s="I am Madan";
		char[] inpArr=s.toCharArray();
		char[] resArr=new char[inpArr.length];
		
		for(int i=0;i<inpArr.length;i++)
		{
			if(inpArr[i]==' ')
			{
				resArr[i]=inpArr[i];
			}
		}
			
		int j=resArr.length-1;
		for(int i=0;i<inpArr.length;i++)
		{
			if(inpArr[i]!=' ')
			{
				if(resArr[j]==' ')
				{
					j--;
				}
				
				resArr[j]=inpArr[i];
				j--;
			}
		}
		System.out.println(new String(resArr));
		*/
		/*
		//Reverse characters of each word in string
		String ip="I am Madan";
		String op="";
		String[] words=ip.split(" ");
		
		for(int i=0;i<words.length;i++)
		{
			String revWord="";
			for(int j=words[i].length()-1;j>=0;j--)
			{
				revWord=revWord+words[i].charAt(j);
			}
			
			op=op+revWord;
			
			if(i!=words.length-1)
			{
				op =op+" ";
			}
		}
	
		System.out.println(op);	
		*/
		
		//Reverse Words of a string
		String ip="Learn java with ease";
		String op="";
		String[] words=ip.split(" ");
		
		for(int i=words.length-1;i>=0;i--)
		{
			op=op+words[i];	
			
			if(i!=0)
			{
				op=op+" ";
			}
		
		System.out.println(op);
		
		}
	}
}
  