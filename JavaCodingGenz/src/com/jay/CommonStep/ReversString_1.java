package com.jay.CommonStep;

public class ReversString_1 {

	public static void main(String[] args) {

		String s = "jayanth";
		
		System.out.println("real string is =>"+s);
		
		int i=0,j=s.length()-1;
		
		char ch[] = s.toCharArray();
		while(i<j)
		{
			char temp = ch[i];
			
			ch[i] = ch[j];
			
			ch[j] = temp;
			
			i++;
			j--;
		}
		
		String ans = new String(ch);
		
		System.out.println("reversed string is =>"+ans);
		
	}

}
