package com.jay.CommonStep;

import java.util.HashMap;
import java.util.Map;

public class LetterCount_3 {

	public static void main(String[] args) {

		Map<Character, Integer> map = new HashMap<>();
		
	   String s = "jayanthkumar";
	   
	   char words[] = s.toCharArray();
	   
	   for(char word:words)
	   {
		   map.put(word, map.getOrDefault(word, 0)+1);
	   }
	   
	   System.out.println(map);
	   
	   
	}

}
