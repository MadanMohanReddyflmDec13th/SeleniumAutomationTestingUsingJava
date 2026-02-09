package hashMapOCT12th;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapPractice1 {

	public static void main(String[] args) {
		
	Map<String,Integer> hMap=new HashMap<String,Integer>();
	
	hMap.put("Ram",101);
	hMap.put("Sam",102);
	hMap.put("Ravi",103);
	hMap.put("Gopi",104);
	
	System.out.println(hMap.get("Sam"));
	System.out.println(hMap.keySet());
	System.out.println(hMap.values());
	System.out.println(hMap.containsKey("Ravi"));
	System.out.println(hMap.put("Ram", 106));
	System.out.println(hMap.put("Vimal", 105));
	System.out.println(hMap); 
	System.out.println(hMap.size());
	System.out.println(hMap.remove("Vimal"));
	System.out.println(hMap.size());
	System.out.println(hMap.isEmpty());
	
	Set<Entry<String, Integer>> entries=hMap.entrySet();
	
	//for each loop for iterating through each set
	for(Entry<String,Integer> tempvar:entries)
	{
		System.out.println(tempvar.getKey()+"..."+tempvar.getValue());
	}
	
	//By using Iterator
	Iterator<Entry<String, Integer>> itr =entries.iterator();
	Entry<String, Integer> entry=null;
	while(itr.hasNext())
	{
		entry=itr.next();
		System.out.println(entry.getKey()+"....."+entry.getValue());
	}
 
	}
}
