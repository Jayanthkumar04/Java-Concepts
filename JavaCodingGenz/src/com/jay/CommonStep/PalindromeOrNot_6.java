package com.jay.CommonStep;

public class PalindromeOrNot_6 {

	public static void main(String[] args) {

		String s = "MALAYALAMM";
		
		int i=0,j=s.length()-1;
		
		boolean flag = true;
		while(i < j)
		{
			if(s.charAt(i) != s.charAt(j)) {
				
				flag = false;
				break;
			}
			
			i++;
			j--;
			
		}
		if(flag == true) System.out.println("it is palindrome");
		else System.out.println("it is not palindrome");
		
	}

}
