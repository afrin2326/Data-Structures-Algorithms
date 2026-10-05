package com.iostream;

import java.util.ArrayList;

public class StackUsingArrayList
{
	
	public static class Stack
	{
		ArrayList<Integer> list=new ArrayList<>();
		
		public  boolean isEmpty()
		{
			return list.size()==0;
		}
	}

}
