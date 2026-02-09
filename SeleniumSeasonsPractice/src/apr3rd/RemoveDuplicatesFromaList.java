package apr3rd;


import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class RemoveDuplicatesFromaList {

	public static void main(String[] args) 
	{
		
		List fruits	=new ArrayList();
		fruits.add("apple");
		fruits.add("banana");
		fruits.add("apple");
		fruits.add("grapes");
		fruits.add("orange");
		fruits.add("apple");
		fruits.add("grapes");
		
		System.out.println(fruits);
		
		Set fruitsWithoutDuplicates=new HashSet(fruits);
		System.out.println(fruitsWithoutDuplicates);
	}

}
