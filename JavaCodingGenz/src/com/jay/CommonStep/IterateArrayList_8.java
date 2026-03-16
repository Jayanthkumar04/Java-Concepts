package com.jay.CommonStep;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IterateArrayList_8 {

	public static void main(String args[])
	{
		List<Integer> list = new ArrayList<>();
		
		list.add(10);list.add(12);list.add(87);list.add(90);
		
		System.out.println("ADVANCED FOR LOOP");
		for(int i:list)
		{
			System.out.print(i+"  ");
		}
		System.out.println();
		
		System.out.println("FOR LOOP");
		
		for(int i=0;i<list.size();i++)
		{
			System.out.print(list.get(i)+"  ");
		}
		System.out.println();
		System.out.println("ITERATOR WHILE");
		
		Iterator itr = list.iterator();
		
		while(itr.hasNext())
		{
			System.out.print(itr.next()+"  ");
			
		}
		System.out.println();
		
	}
}
