package com.jay.CommonStep;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class IterateHashpMap_5 {

	public static void main(String[] args) {

		Map<String, Integer> map = new HashMap<>();
		
		map.put("java", 1); map.put("hello", 2);map.put("jay", 5);
		
		
		for(Map.Entry<String,Integer> entry :map.entrySet())
		{
			System.out.println("key => "+entry.getKey()+"value ==> "+entry.getValue());
		}
		
		
		
		Iterator iterator = map.entrySet().iterator();
		
		while(iterator.hasNext())
		{
			Map.Entry entry = (Entry)iterator.next();
			
			System.out.println("key => "+entry.getKey()+"value ==> "+entry.getValue());
			
		}
		
	}

}
