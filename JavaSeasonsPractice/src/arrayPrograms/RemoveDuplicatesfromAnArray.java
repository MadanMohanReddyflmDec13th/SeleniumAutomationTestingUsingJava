package arrayPrograms;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicatesfromAnArray {

	public static void main(String[] args) {
		
		int[] a= {9,3,4,6,6,2,2,6,3,7};
		
		Set<Integer> hSet=new HashSet<Integer>();
		for(int i=0; i<a.length; i++)
		{
			hSet.add(a[i]);
		}
		System.out.println(hSet);
		
		/*for(int var:a)
		{
			hSet.add(var);
		}
		System.out.println(hSet);
		*/
		
		/*
		//Remove Elements in an ArrayList
		ArrayList<Integer> aL=new ArrayList<Integer>();
		aL.add(1);
		aL.add(2);
		aL.add(3);
		aL.add(4);
		aL.add(4);
		aL.add(4);
		aL.add(2);
		
		Set<Integer> hS= new HashSet<Integer>(aL);
		System.out.println(hS);
		*/
	}
}
