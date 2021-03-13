package com.example4.example4;

public class ReverseString 
{
public static void main(String[] args)
{
	String name="akshaya";
	int length=name.length();
	String revs="";
	for(int i=length-1;i>=0;i--)
	{
		String rev=revs+name.charAt(i);
	}
	System.out.println("rev");
}
}
