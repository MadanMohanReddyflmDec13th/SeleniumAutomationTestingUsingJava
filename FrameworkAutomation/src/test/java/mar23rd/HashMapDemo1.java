package mar23rd;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapDemo1 {

	public static void main(String[] args) {
		
		HashMap<Integer, String> hMap = new HashMap<Integer, String>();
		
		hMap.put(1,"Ram");
		hMap.put(2,"Sam");
		hMap.put(3,"jim");
		hMap.put(4,"Raj");
		
		System.out.println(hMap.keySet());
		System.out.println(hMap.values());		
		System.out.println(hMap.containsKey(3));
		System.out.println(hMap.containsValue("Sam"));
		System.out.println(hMap.size());
		System.out.println(hMap.remove(4));
		System.out.println(hMap.size());
		System.out.println(hMap.get(1));
		System.out.println(hMap.isEmpty());
		
		Set<Entry<Integer, String>> entries  = hMap.entrySet();
		
		for(Entry<Integer, String> tempvar:entries)
		{
			System.out.println(tempvar.getKey()+"..."+tempvar.getValue());
		}

	}

}