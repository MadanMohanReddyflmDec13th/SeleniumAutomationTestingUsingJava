package stringprograms;

import java.util.LinkedHashSet;

public class RemoveDuplicatesFromAString {

	public static void main(String[] args) {
		
		String ip="programming";
		String op="";
		
		LinkedHashSet <Character> hSet=new LinkedHashSet<Character>();
		
		for(int i=0; i<ip.length(); i++)
		{
			hSet.add(ip.charAt(i));
		}
		
		for(Character ch : hSet)
		{
			op=op+ch;
		}
		
		System.out.println(op);

	}

}
