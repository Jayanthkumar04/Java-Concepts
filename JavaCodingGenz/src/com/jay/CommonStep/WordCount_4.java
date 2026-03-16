package com.jay.CommonStep;

import java.util.HashMap;
import java.util.Map;

public class WordCount_4 {

	public static void main(String[] args) {

		Map<String,Integer> map = new HashMap<>();
		 String s = "java is awesome and java is great";
		 
		 String[] words = s.split("\\s+");
		 
		 for(String word:words) {
			 
			 if(map.containsKey(word)) {
				 map.put(word, map.get(word)+1);
			 }
			 else {
				 map.put(word, 1);
			 }
		 }
		 
		 System.out.println(map);
	}

}
