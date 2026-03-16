package com.jay.Maps;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapss {

	public static void main(String[] args) {

		Map<Integer,String> map = new HashMap<>();
		
		map.put(1, "jay");
		
		map.put(2, "way");
		
		map.put(3, "hey");
		
		map.put(4, "hahaaa");
		
		System.out.println("all values "+map);
		
		System.out.println("get value"+map.get(2));
		
		map.put(3, "heeeeey");
		System.out.println("modified ==>"+map);
		
		map.remove(4);
		
		System.out.println("after remove ==>"+map);
		
		System.out.println(map.containsKey(4));
		
		System.out.println(map.containsValue("hey"));
		
		map.put(10, null);
		
		map.put(10, "jayyyy");
		
		System.out.println("null key ==>"+map);
		
		
		for(int i:map.keySet())
		{
			System.out.println(i);
		}
		
		System.out.println("entery interface");
		for(Map.Entry entry: map.entrySet())
		{
			System.out.println(entry.getKey()+"==>"+entry.getValue());
		}
				
		Set s = map.entrySet();
		
		Iterator itr = s.iterator();
		
		while(itr.hasNext())
		{
		
			Map.Entry entry = (Entry)itr.next();
			
			System.out.println(entry.getKey()+"   "+entry.getValue());
	
		}
			
		
	}

}
